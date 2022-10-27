import java.util.Scanner;

public class IntervaloNumeros {

    public static void main(String[] args) {

        int numero;

        System.out.println("Digite um numero");
        Scanner leitor = new Scanner(System.in);

        numero = leitor.nextInt();

        if (numero < 200 && numero > 100){
            System.out.println("Este numero esta no intervalo entre 100 e 200");
        } else {
            System.out.println("Este numero nao esta no intervalo entre 100 e 200");
        }
    }
}