package pl.krysinski.repo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Repository {


    public void JDBCCreateTablePet(){
        Connector.JDBCConnection();
        Statement stmt = null;
        try {
            stmt = Connector.JDBCConnection().createStatement();
//            String sqlDrop = "DROP TABLE IF EXISTS PET";
            String sql = "CREATE TABLE schema_name.PET " +
                    "(ID INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY," +
                    " SPECIES           VARCHAR(50)    NOT NULL, " +
                    " WEIGHT            INTEGER     NOT NULL) ";

//            stmt.executeUpdate(sqlDrop);
            stmt.executeUpdate(sql);
            stmt.close();
            Connector.JDBCConnection().close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
        System.out.println("Table created successfully");
    }


}
