package Backend.models;

public class Mecanique implements Utilisateur {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;
    private String telephone;
    private String adresse;
    private String role;
    private Garage garage;

    public Mecanique(String nom, String prenom, String email, String motDePasse, String telephone, String adresse,
            Garage garage, int id) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.telephone = telephone;
        this.adresse = adresse;
        this.role = "MECANICIEN";
        this.garage = garage;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getTelephone() {
        return telephone;
    }

    @Override
    public String getAdresse() {
        return adresse;
    }

    @Override
    public String getMotDePasse() {
        return motDePasse;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    @Override
    public void setRole(String role) {
        this.role = role;
    }

    public Garage getGarage() {
        return garage;
    }
}
