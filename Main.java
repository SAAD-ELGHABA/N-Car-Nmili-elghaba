import java.sql.Connection;

import Backend.models.Client;
import DAO.ClientDao;

public class Main {
    public static void main(String[] args) {
        Connection conn = DatabaseInitializer.getConnection("jdbc:mysql://localhost:3306/", "mydatabase", "root",
                "otobot");
        try (conn) {
            Client client = new Client("ACHAK", "TARIK", "tarik.Achak@gmail.com", "0694696593", "MARRAKECH", "1234567",
                    0);
            ClientDao clientdao = new ClientDao(conn);
            clientdao.insertClient(client);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
