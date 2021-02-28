package pl.krysinski.repo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
    static Connection CONNECTION;

    public static Connection JDBCConnection() {
        CONNECTION = null;
        try {
            Class.forName("org.postgresql.Driver");
            CONNECTION = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/WSBexercises",
                            "WSBMK", "wsb2020");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
        return CONNECTION;
    }
}
