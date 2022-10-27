/* Start - Desafio 22
22. Faça um algoritmo que receba o preço de custo e o preço de venda de 5 produtos. Mostre como resultado
se houve lucro, prejuízo ou empate para cada produto. Informe o saldo dos produto, a média de preço de custo e
do preço de venda;
*/

package com.start.java;
import java.util.Scanner;

public class Desafio22 {
    public static void main(String[] args) {

        String nomeProduto;
        float precoCusto = 0.0f;
        float precoVenda = 0.0f;
        float somaPrecoCusto = 0.0f;
        float somaPrecoVenda = 0.0f;
        float mediaPrecoCusto = 0.0f;
        float mediaPrecoVenda = 0.0f;
        float balancoProduto = 0.0f;
        float balancoTotalProdutos = 0.0f;

        Scanner leitor = new Scanner(System.in);

        int i = 0;
        for (; i < 5; i++) {
            System.out.print("Informe o nome do produto: ");
            nomeProduto = leitor.next();

            System.out.print("Informe o preço de custo do produto: R$ ");
            precoCusto = leitor.nextFloat();

            System.out.print("Informe o preço de venda do produto: R$ ");
            precoVenda = leitor.nextFloat();

            balancoProduto = precoVenda - precoCusto;

            if (balancoProduto > 0) {
                System.out.println("Lucro de R$ " + String.format("%.2f", balancoProduto));
            } else if (balancoProduto < 0) {
                System.out.println("Prejuízo de R$ " + String.format("%.2f", balancoProduto));
            } else {
                System.out.println("Empate");
            }

            somaPrecoCusto = somaPrecoCusto + precoCusto;
            somaPrecoVenda = somaPrecoVenda + precoVenda;
            balancoTotalProdutos = balancoTotalProdutos + balancoProduto;

        }

        mediaPrecoCusto = somaPrecoCusto / i;
        mediaPrecoVenda = somaPrecoVenda / i;

        System.out.println("O saldo de venda dos produto é de: R$ " + String.format("%.2f", balancoTotalProdutos));

        System.out.println("A média do preço de custo dos produtos é de: R$ " + String.format("%.2f", mediaPrecoCusto));
        System.out.println("A média do preço de venda dos produtos é de: R$ " + String.format("%.2f", mediaPrecoVenda));


    }
}
