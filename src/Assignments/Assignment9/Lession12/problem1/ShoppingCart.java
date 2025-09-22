package Assignments.Assignment9.Lession12.problem1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter quantity of items to add (1-50): ");
            try {
                int quantity = sc.nextInt();

                if (quantity < 1 || quantity > 50) {
                    throw new IllegalArgumentException("Quantity must be between 1 and 50.");
                }

                System.out.println("Successfully added " + quantity + " items to your cart!");
                break;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer value.");
                sc.nextLine();

            } catch (IllegalArgumentException ie) {
                System.out.println(ie.getMessage());
            }
        }

        sc.close();
    }
}