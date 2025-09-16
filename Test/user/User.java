package Test.user;

import java.util.Scanner;

import Backend.models.Client;

public class User {
    public void getInfoUser() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Nom : ");
        String nom = userInput.nextLine();

        System.out.println("Prenom : ");
        String prenom = userInput.nextLine();

        System.out.println("Email : ");
        String email = userInput.nextLine();

        System.out.println("Telephone : ");
        String tele = userInput.nextLine();

        System.out.println("Adresse : ");
        String adresse = userInput.nextLine();

        System.out.println("Mot de passe : ");
        String pwd = userInput.nextLine();

        Client client = new Client(nom, prenom, email, tele, adresse, pwd, 0);
    }
}
