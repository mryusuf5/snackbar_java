package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean ordering = true;
        Snackbar snackbar = new Snackbar();
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0.00;

        while (ordering) {
            System.out.println("What would you like to order? (1, 2, 3)");
            snackbar.displaySnacks();

            int userChoice = getUserChoice(scanner);

            System.out.println("How many would you like?");
            int userChoiceAmount = getUserChoiceAmount(scanner);

            while (!snackbar.getSnack(userChoice).checkStock(userChoiceAmount)) {
                System.out.println("Not enough in stock. Choose your amount again.");
                userChoiceAmount = getUserChoiceAmount(scanner);
            }

            snackbar.getSnack(userChoice).updateStock(userChoiceAmount);
            totalPrice += snackbar.getSnack(userChoice).totalPrice(userChoiceAmount);

            System.out.println("Your total is: " + totalPrice);
            System.out.println("Would you like to order more? (Y or N)");
            String keepOrdering = scanner.next();

            if (!keepOrdering.equalsIgnoreCase("y")) {
                ordering = false;
            }
        }

        System.out.println("Your total is: " + totalPrice);
    }

    private static int getUserChoice(Scanner scanner) {
        int userChoice;
        do {
            System.out.print("Enter your choice (1, 2, 3): ");
            userChoice = scanner.nextInt() - 1;

            if (userChoice < 0 || userChoice >= 3) {
                System.out.println("Invalid choice. Please choose between 1, 2, and 3.");
            }

        } while (userChoice < 0 || userChoice >= 3);

        return userChoice;
    }

    private static int getUserChoiceAmount(Scanner scanner) {
        System.out.print("Enter the quantity: ");
        return scanner.nextInt();
    }
}
