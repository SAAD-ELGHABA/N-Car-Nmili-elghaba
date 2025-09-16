package Garagiste.Backend.models;

public class Voiture {
    private int id;
    private String marque;
    private String modele;
    private String matriculation;
    private int annee;
    private String couleur;
    private int kilometrage;
    private String typeCarburant;

    public Voiture(String marque, String modele, String matriculation, int annee, String couleur, int kilometrage, String typeCarburant, int id) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.matriculation = matriculation;
        this.annee = annee;
        this.couleur = couleur;
        this.kilometrage = kilometrage;
        this.typeCarburant = typeCarburant;
    }

    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }
    public String getMatriculation() {
        return matriculation;
    }
    public void setMatriculation(String matriculation) {
        this.matriculation = matriculation;
    }
    public int getAnnee() {
        return annee;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }
    public String getCouleur() {
        return couleur;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    public int getKilometrage() {
        return kilometrage;
    }
    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }
    public String getTypeCarburant() {
        return typeCarburant;
    }
    public void setTypeCarburant(String typeCarburant) {
        this.typeCarburant = typeCarburant;
    }

}
