/* Start - Desafio 24
 24. Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;
*/

package com.start.java;
import java.util.Scanner;

public class Desafio24 {
    public static void main(String[] args) {

        char desejaContinuar = 'S';

        while(desejaContinuar == 'S' || desejaContinuar == 's'){
            System.out.println("Informe um número: ");
            Scanner leitor = new Scanner(System.in);
            int numero = leitor.nextInt();

                if(numero == 0) {
                    System.out.println("O número é igual a zero");
                } else if (numero > 0) {
                    System.out.println("Número positivo");
                } else if (numero < 0) {
                    System.out.println("Número negativo");
                } else {
                    System.out.println("Digite um número inteiro:");
                }

            System.out.println("Deseja continuar [S/N]?");
            desejaContinuar = leitor.next().charAt(0);
        }

    }
}
