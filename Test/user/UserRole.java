package Test.user;

import java.util.Scanner;

public class UserRole {

    public String getUserRole() {

        Scanner userInput = new Scanner(System.in);

        System.out.println("User Role : \n 1-client \n 2-mechanique");

        String role = userInput.nextLine();

        return role;
    }
}
