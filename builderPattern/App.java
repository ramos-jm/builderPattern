package SoftEng2.builderPattern;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        while(loop) {
            System.out.println("-----Welcome to E-Commerce App-----");
            System.out.println("1. Register User");
            System.out.println("2. Exit App");
            System.out.print("Which Service do you want to use: ");
            Integer choice = scan.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("");
                    register();
                    break;

                case 2:
                    System.out.println("\nExiting Program");
                    System.out.println("Goodbye Thank you for Using our Subscription Services");
                    System.out.println("\n--!!App Shutting Down!!--");
                    System.exit(0);
                    break;

                default:
            }
        }
}
    public static void register(){
        Scanner input = new Scanner(System.in);

        String firstName= "";
        String lastName= "";
        String email= "";
        String address= "";
        String phone = "";
        Integer age = 0;
        boolean ageValidate = false;

        System.out.println("--Registration Form--");
        do {
            System.out.print("Enter your first name: ");
            firstName = input.nextLine().trim();
            if (firstName == "")
                System.out.println("First name is required. Please enter your first name.\n");
        } while (firstName == "");

        do {
            System.out.print("Enter your last name: ");
            lastName = input.nextLine().trim();
            if (lastName == "")
                System.out.println("Last name is required. Please enter your last name.\n");
        } while (lastName == "");

        System.out.print("Enter your email (optional): ");
        email = input.nextLine();

        System.out.print("Enter your address (optional): ");
        address = input.nextLine();

        do {
            System.out.print("Enter your phone number: ");
            phone = input.nextLine().trim();
            if (phone == "")
                System.out.println("Phone number is required. Please enter your phone number.\n");
        } while (phone == "");

        while (!ageValidate) {
            System.out.print("Enter your age: ");
            String ageInput = input.nextLine().trim();
            if (ageInput.isEmpty())
                System.out.println("Age is required. Please enter your age.\n");
            else {
                try {
                    age = Integer.parseInt(ageInput);
                    if (age <= 0)
                        System.out.println("Age must be a positive number.\n");
                    else
                        ageValidate = true;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid number for age.\n");
                }
            }
        }

        User user = new User.UserBuilder()
                .lastName(lastName)
                .phone(phone)
                .firstName(firstName)
                .age(age)
                .address(address)
                .email(email)
                .build();

        // Display the user information
        System.out.println("\nUser Information Details: ");
        System.out.println("First Name: " + user.firstName);
        System.out.println("Last Name: " + user.lastName);
        System.out.println("Email: " + user.email);
        System.out.println("Address: " + user.address);
        System.out.println("Phone Number: " + user.phone);
        System.out.println("Age: " + user.age);
        System.out.println();

    }

}
