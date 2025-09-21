package Assignments.Assignment9.Lession12.problem1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create scanner once

        while (true) {
            System.out.print("Enter quantity of items to add (1-50): ");
            try {
                int quantity = sc.nextInt();
                if (quantity >= 1 && quantity <= 50) {
                    System.out.println("Successfully added " + quantity + " items to your cart!");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter an integer value ");
                sc.next();
            }catch(IllegalArgumentException ie){{
                System.out.println("Enter an integer value in range 1-50");
                sc.next();
            }

            }
        }
        sc.close();
    }
}