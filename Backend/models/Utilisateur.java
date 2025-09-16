package Backend.models;

public interface Utilisateur {

    String getNom();
    String getPrenom();
    String getEmail();
    String getTelephone();
    String getAdresse();
    String getMotDePasse();
    String getRole();
    void setNom(String nom);
    void setPrenom(String prenom);
    void setEmail(String email);
    void setTelephone(String telephone);
    void setAdresse(String adresse);
    void setMotDePasse(String motDePasse);
    void setRole(String role);
}
