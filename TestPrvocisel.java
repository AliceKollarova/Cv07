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
public class TestPrvocisel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte cele cislo");
        int n = sc.nextInt();
        
        boolean jePrv = true;
        int d = 2;
        while (d <= n/2) {
            if (n % d == 0) {
                jePrv = false;
            }
            d++;
        }
        System.out.format("Cislo %d %s prvocislem%n", n, jePrv?"je":"neni");
    }
}
