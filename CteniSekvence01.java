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
public class CteniSekvence01 {
    public static void main(String[] args) {
        // cteni posloupnosti cisel
        // uzivatel zadava pocet a nasledne cisla
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Zadej pocet");
        int n = sc.nextInt();
        System.out.println("Zadej cisla");
        
        // inicializace zpracovani/algoritmu
        int soucet = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            // zpracovani cisla x
            soucet = soucet + x;
        }
        // vysledek zpracovani cele posloupnosti
        float prumer = (float)soucet / n;
        System.out.println(soucet);
        System.out.println(prumer);
    }
}

// soucet
// soucin
// minimum
// maximum
// pocet hodnot
// posloupnost