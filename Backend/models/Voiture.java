package Backend.models;

import java.util.ArrayList;
import java.util.List;

public class Voiture {
    private int id;
    private String marque;
    private String modele;
    private String matriculation;
    private int annee;
    private String couleur;
    private int kilometrage;
    private String typeCarburant;
    private Client proprietaire;
    private List<Intervention> interventions = new ArrayList<>();


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
        return this.annee;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }
    public String getCouleur() {
        return this.couleur;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    public int getKilometrage() {
        return this.kilometrage;
    }
    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }
    public String getTypeCarburant() {
        return this.typeCarburant;
    }
    public void setTypeCarburant(String typeCarburant) {
        this.typeCarburant = typeCarburant;
    }
    public Client getProprietaire() {
        return this.proprietaire;
    }

    public void setProprietaire(Client proprietaire) {
        this.proprietaire = proprietaire;
    }

    public List<Intervention> getInterventions() {
        return this.interventions;
    }

    public void setInterventions(List<Intervention> interventions) {
        this.interventions = interventions;
    }


    public String toString() {
        return "Voiture [id=" + this.id + ", marque=" + this.marque + ", modele=" + this.modele + ", matriculation=" + this.matriculation
                + ", annee=" + this.annee + ", couleur=" + this.couleur + ", kilometrage=" + this.kilometrage + ", typeCarburant="
                + this.typeCarburant + "]";
    }
}
