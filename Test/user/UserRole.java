package Test.user;

import java.util.Scanner;

public class UserRole {
    static String getUserRole() {
        Scanner userInput = new Scanner(System.in);
        String role = userInput.nextLine();
        return role;
    }
}
