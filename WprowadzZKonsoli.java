/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopl10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author tychu
 */
public class WprowadzZKonsoli {

    public void wpiszInt() throws FileNotFoundException, IOException {
        Scanner input = new Scanner(System.in);
        try {
            FileReader fr = new FileReader("intWpisz.txt");
        BufferedReader br = new BufferedReader(fr);
            int intRead = 0;
        while (intRead != 0) {
            intRead = br.read();
            
        }
        br.close();
    }
        catch (InputMismatchException e) {
            System.out.println("Wprowadzone dane nie są typu int");
        }
        catch (FileNotFoundException e){
            System.out.println("Nie odnaleziono pliku");
        }
    }

    public void wpiszString() throws IOException {
        try {
            System.out.println("Odczyt String");
        FileReader fr = new FileReader("stringWpisz.txt");
        BufferedReader br = new BufferedReader(fr);
            String stringRead = null;
        while (stringRead != null) {
            stringRead = br.readLine();
            
        }
        br.close();
            System.out.println("Zapis String");
        String[] linie = {"Pierwsza linia tekstu do zapisania", "druga linia - kilka liczb: 12, 23, 44", "trzecia linia"};
        
        FileWriter fwo = null; 
        fwo =  new FileWriter("stringWypisz.txt");
        BufferedWriter bwo = new BufferedWriter(fwo);
        
        for(int i = 0; i < linie.length; i++){
        bwo.write(linie[i]);
        bwo.newLine();
        }
        bwo.close();
        

        } catch (InputMismatchException e) {
            System.out.println("Wprowadzone dane nie są typu String");
        } catch (FileNotFoundException e) {
            System.out.println("Nie odnaleziono pliku");
        }
        System.out.println("------------------------");
        
        

    }

    public void wpiszDouble() {
        Scanner input = new Scanner(System.in);
        try {
            Double a = input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Wprowadzone dane nie są typu double");
        }
    }

    public void wpiszFloat() {
        Scanner input = new Scanner(System.in);
        try {
            Float a = input.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Wprowadzone dane nie są typu float");
        }
    }
}
