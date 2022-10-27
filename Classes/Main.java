import Classes.Pessoa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Criando objeto pessoa (semelhante a criar uma variável)
           O primeiro "Pessoa" corresponde à classe Pessoa
           Ao instanciar o objeto, será executado o que estiver no método contrutor da classe Pessoa
           Os valores setados aqui são definidos como default
         */

        Pessoa objetoPessoa = new Pessoa(70.0f, 1.70f);

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o peso: ");
        objetoPessoa.setPeso(leitor.nextFloat());

        System.out.print("Digite a altura: ");
        objetoPessoa.setAltura(leitor.nextFloat());

        System.out.printf("O IMC é: " + "%.2f", objetoPessoa.calcularIMC());
    }
}