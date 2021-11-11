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
public class VypocetVyrazu {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Vypocet aritmetickeho vyrazu");
        System.out.println("Zadej cislo, operand a cislo");
        
        double a = sc.nextDouble();
        char op = sc.next().charAt(0);     
        double b = sc.nextDouble();
        
        double v;
        switch (op) {
            case '+' : v = a + b; break;
            case '-' : v = a - b; break;
            case '*' : v = a * b; break;
            case '/' : v = a / b; break;
            default : v = Double.NaN;
        }
        
        System.out.println(v);
    }
}
