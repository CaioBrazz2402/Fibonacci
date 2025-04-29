/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacci;

/**
 *
 * @author CaioBraz
 */
public class Fibonacci {

    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, count = 0;

        System.out.println("Os 10 primeiros números da sequência de Fibonacci são:");

        // Imprimir os dois primeiros números
        System.out.println(n1);
        System.out.println(n2);

        // Calcular os próximos números da sequência
        while (count < 8) {  // Como já imprimimos os dois primeiros, precisamos de 8 iterações
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
            count++;
        }
    }
}
