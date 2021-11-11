/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv07;

import java.util.Scanner;

/**
 *
 * @author alice.kollarova
 */
public class CteniSekvence02 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // cteni posloupnosti kladnych cisel
        // posloupnost cisel ukoncena terminatorem
        // terminatorem je 0 nebo zaporna hodnota

        System.out.println("Zadavej cisla, ukonci 0 nebo zapornym");
        float x;
        do {
            x = sc.nextFloat();
            if (x > 0) {
                // zpracovani x
            }

        } while (x > 0);
        // vysledek zpracovani
        
        // varianta s cyklem while
        // inicializace
        while ((x = sc.nextFloat()) > 0) {
            // zpracovani x
        }
        // vysledek zpracovani
    }
}
