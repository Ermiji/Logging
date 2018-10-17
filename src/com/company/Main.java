package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Role> roles = new ArrayList<>();
        ArrayList<User> users = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        String answer = "n";

        System.out.println("Do you want to sign up? ");
        while(answer.equalsIgnoreCase("y")) {
//            System.out.println("Do you want to sign up? ");
            answer = input.nextLine();
            User user = new User();
            Role role = new Role();
            System.out.println("Create a user name: ");
            user.setUsername(input.nextLine());
            System.out.println("Create a user name:: ");
            user.setPassword(input.nextLine());


        }
    }
}
