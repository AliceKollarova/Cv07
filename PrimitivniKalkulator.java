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
public class PrimitivniKalkulator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte vyraz: ");

        float v = sc.nextFloat();
        char op;
        do {
            op = sc.next().charAt(0);
            if (op != '=') {
                float x = sc.nextFloat();
                //
                switch (op) {
                    case '+':
                        v += x;
                        break;
                    case '-':
                        v -= x;
                        break;
                    case '*':
                        v *= x;
                        break;
                    case '/':
                        v /= x;
                        break;
                    default:
                        v = Float.NaN;
                }
            }
        } while (op != '=');
        System.out.println(v);
    }
}
