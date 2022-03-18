package hu.progmatic;

public class Task1 {
    public static void main(String[] args) {
        // Add össze a számokat 1 és 10 között (beleértve az 1-et és a 10-et is).
        // Használj a megoldáshoz ciklust!


        int counter = 1;
        int sum = 0;


        while (counter < 11) {
            sum = sum + counter;
            counter++;
        }
        System.out.println(sum);
    }
}
