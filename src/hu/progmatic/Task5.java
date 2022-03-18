package hu.progmatic;

public class Task5 {

    public static void main(String[] args) {
        // Adott az alábbi két szám:
        //int base = 5;
        //int exponent = 3;
        //Emeld a base nevű változó értékét exponent kitevőre (azaz hatványozd)!
        //A megoldáshoz használj ciklust, és ne a Math.pow()-ot!
        //A megoldásod nem negatív egész számokra működjön mindenképpen!
        //Az eredménynek 125-nek kell lennie, mert 53 = 5 * 5 * 5 = 125.
        //Teszteld a megoldásodat úgy is, hogy az exponent értéke 0! Ebben az esetben az eredmény 1, mert 50 = 1

        int base = 5;
        int multiply = 1;
        int exponent = 3;
        int sum = 1;

        while (multiply <= exponent) {
            sum = sum * base;

            multiply ++;

        }
        System.out.println(sum);


    }
}
