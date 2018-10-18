package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Role> localRoles = new ArrayList<>();
        ArrayList<User> users = new ArrayList<>();

        //Add localRoles for selection
        Role role = new Role(1,"Admin",new ArrayList<User>());
        localRoles.add(role);
        role = new Role(2,"Editor",new ArrayList<User>());
        localRoles.add(role);
        role = new Role(3,"Contributor",new ArrayList<User>());
localRoles.add(role);

        Scanner input = new Scanner(System.in);

        String answer = "n";

        System.out.println("Do you want to sign up? ");
        answer = input.nextLine();
        while(answer.equalsIgnoreCase("y")) {

            User user = new User();
          //  Role role = new Role();
            System.out.println("Create a user name: ");
            user.setUsername(input.nextLine());
            System.out.println("Create a password: ");
            user.setPassword(input.nextLine());

            System.out.println("Select a role: ");
            for(Role r: localRoles){
                System.out.print(r.getName() +" : ");
            }
            System.out.println();

            Role selectedRole=new Role();
            selectedRole.setName(input.nextLine());
            Boolean flag=false;
            for(User u:users){
                if(u.getUsername().equalsIgnoreCase(user.getUsername())) {
                    for (Role r : u.getRoles()) {
                        //it checks if username is allready
                        //in the selected role
                        if (r.getName().equalsIgnoreCase(selectedRole.getName())) {
                            System.out.println("You already have that role.  ");
                            flag = true;
                            break;
                        }
                    }
                }
            }
            if(!flag) {
                user.getRoles().add(selectedRole);

                users.add(user);
            }
            System.out.println("Do you want to sign up? ");
            answer = input.nextLine();

        }

        System.out.println("Do you want to sign in? ");
        answer = input.nextLine();
      if(answer.equalsIgnoreCase("y")) {
            System.out.println("Enter a user name: ");
            String name=input.nextLine();
            System.out.println("Enter a password: ");
            String password= input.nextLine();

            for(User u: users){
                if(u.getUsername().equalsIgnoreCase(name) && u.getPassword().equalsIgnoreCase(password)){
                    for(Role r:u.getRoles()) {
                        System.out.println("Your role is : " + r.getName());
                    }
                }
            }

       }
    }
}
