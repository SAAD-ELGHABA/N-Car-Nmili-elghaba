package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Backend.models.Client;

public class ClientDao {
    public Connection connexion;

    public ClientDao(Connection connection) {
        this.connexion = connection;
    }

    public void insertClient(Client client) throws SQLException {
        String sql = """
                    INSERT INTO users(
                        nom,prenom,email,telephone,adresse,motDePasse,role
                    ) VALUES(?,?,?,?,?,?,?)
                """;
        PreparedStatement pstmt = connexion.prepareStatement(sql);
        pstmt.setString(1, client.getNom());
        pstmt.setString(2, client.getPrenom());
        pstmt.setString(3, client.getEmail());
        pstmt.setString(4, client.getTelephone());
        pstmt.setString(5, client.getAdresse());
        pstmt.setString(6, client.getMotDePasse());
        pstmt.setString(7, "client");

        pstmt.executeUpdate();
        
        System.out.println("Success !");
    }
}
