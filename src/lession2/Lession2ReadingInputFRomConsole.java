package lession2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lession2ReadingInputFRomConsole {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int lucky;
        System.out.println("Enter the Number ");
        lucky = sc.nextInt();
        System.out.println("Your Lucky Number is "+lucky);

        // Buffer
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number ");
        lucky = Integer.parseInt(bf.readLine()); // readlone read complete line untill enter
        System.out.println("Your Lucky Number is "+lucky);
        sc.close();
    }
}
