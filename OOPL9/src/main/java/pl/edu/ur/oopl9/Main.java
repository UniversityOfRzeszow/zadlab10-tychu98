package pl.edu.ur.oopl9;

import java.util.HashMap;
import java.util.Scanner;


public class Main {
   
    public static void main(String[] args) {

        HashMap<String, String> ang = new HashMap<>();

        Scanner we = new Scanner(System.in);

        ang.put("telefon", "phone");
        ang.put("haslo", "password");
        ang.put("imie", "name");
        ang.put("dom", "house");
        ang.put("biuro", "office");
        ang.put("mezczyzna", "man");
        ang.put("wiek", "age");
        ang.put("placek", "cake");
        ang.put("piec", "five");
        ang.put("rodzina", "family");
        ang.put("duzy", "big");
        ang.put("auto", "car");
        ang.put("kot", "cat");
        ang.put("pies", "dog");
        ang.put("drzewo", "tree");
        ang.put("trawa", "grass");
        ang.put("szklo", "glass");
        ang.put("szkola", "school");
        ang.put("stary", "old");
        ang.put("mlody", "young");
        
        System.out.println("Słowa w słowniku: ");
        System.out.println("1.telefon \n2.haslo\n3.imie\n4.dom\n"
                + "5.biuro\n6.mezczyzna\n7.wiek\n8.placek\n9.piec"
                + "\n10.rodzina\n11.duzy\n12.auto\n13.kot\n14.pies"
                + "\n15.drzewo\n16.trawa\n17.szklo\n18.szkola\n"
                + "19.stary\n20.mlody\n\n");

        int i = 1;

        while (i == 1) {
            System.out.println("Podaj wyraz do przetłumaczenia: ");
            String x = we.next();
            if ("koniec!".equals(x)) {
                i = 0;
                
            }          
             else {
                System.out.println("Po angielsku: " + ang.get(x)+"\n");
            }

        }

    }
}
