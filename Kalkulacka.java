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
public class Kalkulacka {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Zadejte prvni cislo: ");
        float a = sc.nextFloat();
        System.out.println("Zadejte druhe cislo: ");
        float b = sc.nextFloat();
        System.out.println("Zvolte operaci: ");
        System.out.println("Stisknete '1' pro operaci scitani");
        System.out.println("Stisknete '2' pro operaci odcitani");
        System.out.println("Stisknete '3' pro operaci nasobeni");
        System.out.println("Stisknete '4' pro operaci deleni");
        int volba = sc.nextInt();
        char op = sc.next().charAt(0);
        float vysledek = 0;
        
        switch (volba) {
            case 1:
                vysledek = a + b;
            break;
            case 2:
                vysledek = a - b;
            break;
            case 3:
                vysledek = a * b;
            break;
            case 4:
                vysledek = a / b;
            break;
        }
        if ((volba > 0) && (volba < 5)) {
            System.out.println("Vysledek: " + vysledek);
        }
        else {
            System.out.println("Neplatna volba");
        }
        System.out.println("");
    }
}
