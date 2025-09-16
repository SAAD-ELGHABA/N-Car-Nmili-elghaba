package Backend.models;

public class Intervention {
    private int id;
    private String description;
    private String date;
    private double cout;
    private Voiture voiture;
    private Mecanique mecanique;
    private Client client;
    private String statut; 
    private String type; 

    public Intervention(String description, String date, double cout, Voiture voiture, Mecanique garagistre, Client client, String statut, String type, int id) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.cout = cout;
        this.voiture = voiture;
        this.mecanique = garagistre;
        this.client = client;
        this.statut = statut;
        this.type = type;
    }   

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public double getCout() {
        return cout;
    }
    public void setCout(double cout) {
        this.cout = cout;
    }
    public Voiture getVoiture() {
        return this.voiture;
    }
    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }
    public Mecanique getMecanique() {
        return this.mecanique;
    }
    public void setGaragistre(Mecanique mecanique) {
        this.mecanique = mecanique;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public String getStatut() {
        return statut;
    }
    public void setStatut(String statut) {
        this.statut = statut;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
    
}
