package hu.progmatic;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Kérj be a felhasználótól egy pozitív egész számot,
        // és add össze a páros számokat 1-től eddig a számig!
        //Például, ha a felhasználó száma 11, akkor az eredmény: 2 + 4 + 6 + 8 + 10 = 30

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy számot: ");
        int userNumber = scanner.nextInt();
        scanner.nextLine();

        int sum = 0;
        int counter = 2;

        while (counter <= userNumber) {
            sum = sum + counter;
            counter = counter + 2;
        }
        System.out.println("A páros számok összege " + userNumber + "-ig összeadva: " + sum);
    }
}
