/*
Exercício 20
A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
Informar total de carros com ano até 2000 e total geral;
 */

import java.util.Scanner;

public class VeiculoComDesconto {
    public static void main(String[] args) {

        int anoVeiculo = 0;
        float valorVeiculo = 0.0f;
        float valorDesconto = 0.0f;
        int totalAte2000 = 0;
        int totalDepois2000 = 0;
        int totalGeral = 0;
        char desejaContinuar = 'S';

        Scanner leitor = new Scanner(System.in);

        while (desejaContinuar == 'S' || desejaContinuar == 's') {
            System.out.print("Informe o ano de fabricação do veículo: ");
            anoVeiculo = leitor.nextInt();

            System.out.print("Informe o valor do veículo: R$ ");
            valorVeiculo = leitor.nextFloat();

            if (anoVeiculo <= 2000) {
                valorDesconto = 0.12f;
                System.out.println("Valor do desconto: R$ " + ((valorVeiculo)*valorDesconto));
                System.out.println("Valor do veículo com desconto R$ " + (valorVeiculo - (valorVeiculo * valorDesconto)));
                totalAte2000++;
            } else {
                valorDesconto = 0.07f;
                System.out.println("Valor do desconto: R$ " + ((valorVeiculo)*valorDesconto));
                System.out.println("Valor do veículo com desconto R$ " + (valorVeiculo - (valorVeiculo * valorDesconto)));
                totalDepois2000++;
            }

            System.out.print("Deseja informar mais veículos? [S/N]: ");
            desejaContinuar = leitor.next().charAt(0);
        }

        totalGeral = totalAte2000 + totalDepois2000;

        System.out.println("O total de veículos até o ano 2000 é de: " + totalAte2000);
        System.out.println("O total geral de veículos é de: " + totalGeral);
    }
}