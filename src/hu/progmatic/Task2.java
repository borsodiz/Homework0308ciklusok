package hu.progmatic;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Kérj be a felhasználótól egy pozitív egész számot,
        // és ezúttal 1-től eddig a számig add össze a számokat!

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy számot:");
        int finalNumber = scanner.nextInt();
        scanner.nextLine();

        int sum =0;
        int counter = 1;

        while (counter <= finalNumber) {
            sum = sum + counter;
            counter ++;
        }
        System.out.println("A számok összege " + finalNumber + "-ig összeadva: " + sum);
    }
}
