package hu.progmatic;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        //Módosítsd az előző feladat megoldását úgy,
        // hogy megkérdezed a felhasználótól: a páros vagy a páratlan számokat add-e össze.
        //A felhasználó válaszának megfelelően add össze a kért számokat,
        // és az eredményt írd ki a képernyőre!

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy számot: ");
        int userNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("A páros vagy páratlan számokat szeretnéd összeadni? (paros/paratlan): ");
        String pp = scanner.nextLine();

        int sum = 0;
        int counter = 0;

        if (pp.equalsIgnoreCase("paros")) {
            while (counter <= userNumber) {
                sum = sum + counter;
                counter = counter + 2;

            }
            System.out.println("A páros számok összege " + userNumber + "-ig összeadva: " + sum);
        }
            else if (pp.equalsIgnoreCase("paratlan")) {
                counter =1;

                while (counter <= userNumber) {
                    sum = sum + counter;
                    counter = counter +2;
                }
            System.out.println("A páratlan számok összege " + userNumber + "-ig összeadva: " + sum);
            }
        }
    }

