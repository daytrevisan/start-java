package com.start.java;
import java.util.Scanner;

public class EstruturaWhile {
    public static void main(String[] args) {

        int numeroAlunos = 10;

        Scanner leitor = new Scanner(System.in);

        while (numeroAlunos > 0) {
            System.out.println("Informe o nome do aluno: ");
            String nomeAluno = leitor.nextLine();

            System.out.println("Informe o ano do aluno: ");
            int anoAluno = leitor.nextInt();

            System.out.println("Informe a idade do aluno: ");
            int idadeAluno = leitor.nextInt();

            System.out.println(nomeAluno + " está no " + anoAluno + ".o ano" + " e tem " + idadeAluno + " anos.");

                numeroAlunos = numeroAlunos--;
        }
    }
}