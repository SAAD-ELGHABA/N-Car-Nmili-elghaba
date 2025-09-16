package Test.user;

import java.util.HashMap;
import java.util.Scanner;

import Backend.models.Client;

public class User {

    HashMap<String, String> userInfo = new HashMap<String, String>();

    public HashMap<String, String> getInfoUser() {
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

        userInfo.put("nom", nom);
        userInfo.put("prenom", prenom);
        userInfo.put("email", email);
        userInfo.put("adresse", adresse);
        userInfo.put("telephone", tele);
        userInfo.put("password", pwd);

        return userInfo;
    }
}
