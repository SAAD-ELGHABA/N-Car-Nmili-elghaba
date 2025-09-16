import java.util.HashMap;
import java.util.Scanner;

import Backend.models.Client;
import Test.user.User;
import Test.user.UserRole;

public class Main {
    public static void main(String[] args) {
        UserRole get_user_role = new UserRole();
        String user_role = get_user_role.getUserRole();
        if (user_role.toLowerCase().equals("client") || user_role.equals("1")) {
            User userObg = new User();
            HashMap<String, String> user = userObg.getInfoUser();
            System.out.println(user);

            // Client client = new Client(user.nom, user.prenom, user.email, tele, adresse,pwd, 0);

        } else {
            System.out.println("mechanique !");
        }
    }
}
