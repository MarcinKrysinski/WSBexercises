package pl.krysinski.repo;

import java.sql.*;
import java.util.Properties;

public class Connector {
    static Connection CONNECTION;
    static Statement STMT;

    public static Connection JDBCConnection() {
        try {
            Properties properties = new Properties();
            properties.setProperty("url", Configuration.DB_URL);
            properties.setProperty("user", Configuration.USER);
            properties.setProperty("password", Configuration.PASSWORD);
            Class.forName("org.postgresql.Driver");
            CONNECTION = DriverManager
                    .getConnection(Configuration.DB_URL, properties);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Connection database successfully");
        return CONNECTION;
    }

    public static Statement getStatement() {
        try {
            STMT = CONNECTION.createStatement();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return STMT;
    }

    public static void executiveSQLReadAnimal(String sql) {
        try {
            System.out.println("Creating statement...");
            STMT = getStatement();

            ResultSet rs = STMT.executeQuery(sql);

            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getInt("id");
                String species = rs.getString("species");
                double weight = rs.getDouble("weight");


                //Display values
                System.out.print("ID: " + id);
                System.out.print(", Species: " + species);
                System.out.println(", Weight: " + weight);
            }
            rs.close();
        } catch (Exception se) {
            //Handle errors for JDBC
            se.printStackTrace();
        }//Handle errors for Class.forName
        finally {
            //finally block used to close resources
            try {
                if (STMT != null)
                    CONNECTION.close();
            } catch (SQLException se) {
            }// do nothing
            try {
                if (CONNECTION != null)
                    CONNECTION.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main

    public static void executiveSQLReadHuman(String sql) {
        try {
            STMT = getStatement();
            ResultSet rs = STMT.executeQuery(sql);
            System.out.println("Id  Species      Weight    Name     LastName  Salary");

            while (rs.next()) {
                Integer id = rs.getInt("id");
                String species = rs.getString("species");
                double weight = rs.getDouble("weight");
                String name = rs.getString("name");
                String last_name = rs.getString("last_name");
                double salary = rs.getDouble("salary");
                System.out.println(id + "  " + species + "   " + weight+ "   " + name+ "   " +last_name+ "   " +salary);
            }
            System.out.println("Results");
            STMT.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }


    public static void executiveSQL(String sql) {
        try {
            STMT = getStatement();
            STMT.executeUpdate(sql);
            STMT.close();
            Connector.JDBCConnection().close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Records created successfully");


    }
}
