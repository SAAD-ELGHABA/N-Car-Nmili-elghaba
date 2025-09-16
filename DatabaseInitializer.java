import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitializer {

    public static Connection getConnection(String url, String dbName, String user, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void initializeDatabase(String url, String dbName, String user, String password) {

        try (Connection connexion = DriverManager.getConnection(url, user, password);
                Statement stmt = connexion.createStatement()) {

            stmt.execute("CREATE DATABASE IF NOT EXISTS " + dbName);
            stmt.execute("USE " + dbName);

            String createUserTable = """
                        CREATE TABLE IF NOT EXISTS users (
                            id INT AUTO_INCREMENT PRIMARY KEY,
                            prenom VARCHAR(50) NOT NULL,
                            nom VARCHAR(50) NOT NULL,
                            email VARCHAR(100) UNIQUE NOT NULL,
                            telephone VARCHAR(100) NOT NULL,
                            adresse VARCHAR(500)  NOT NULL,
                            motDePasse VARCHAR(100) NOT NULL,
                            role VARCHAR(100) NOT NULL DEFAULT "client",
                            created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                        )
                    """;

            stmt.execute(createUserTable);

            System.out.println("Database initialized successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        initializeDatabase("jdbc:mysql://localhost:3306/", "mydatabase", "root", "otobot");
    }
}