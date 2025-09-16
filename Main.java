import java.sql.Connection;

import Backend.models.Client;
import DAO.ClientDao;

public class Main {
    public static void main(String[] args) {
        DatabaseInitializer dbConnect = new DatabaseInitializer();
        dbConnect.initializeDatabase("jdbc:mysql://localhost:3306/", "mydatabase", "root", "otobot");

        Connection conn = DatabaseInitializer.getConnection("jdbc:mysql://localhost:3306/", "mydatabase", "root",
                "otobot");
        try (conn) {
            Client client = new Client("ELGHABA", "SAAD", "saadlraba@gmail.com", "0694696593", "MARRAKECH", "1234567",
                    0);
            // System.out.println(client.getAdresse());
            ClientDao clientdao = new ClientDao(conn);
            clientdao.insertClient(client);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
