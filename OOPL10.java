package oopl10;

import java.io.IOException;
import java.util.Random;

public class OOPL10 {

    public static void main(String[] args) throws IOException {

        Random los = new Random();

        int i = 1;
        int x;
        int y;
        int iloscDielenPrzezZero = 0;
        double wynik;

        while (iloscDielenPrzezZero < 3) {
            x = los.nextInt(21) - 10;
            y = los.nextInt(21) - 10;

            System.out.print(x + " / " + y + " = ");

            try {
                wynik = x / y;
                System.out.println("" + wynik);
            } catch (ArithmeticException e) {
                System.out.println("Znaleziono wyjątek (dzielenie przez 0)");
                iloscDielenPrzezZero++;

                if (iloscDielenPrzezZero == 3) {
                    System.out.println("\nLiczba wyjątków jes równa 3, więc kończę działanie programu \n---------------------------------------------\n");
                }

            }

        }
        
        
        
        
        WprowadzZKonsoli zad5 = new WprowadzZKonsoli();
        
        zad5.wpiszInt();
        zad5.wpiszString();
        zad5.wpiszDouble();
        zad5.wpiszFloat();
        
        
        
        
        

    }

}
