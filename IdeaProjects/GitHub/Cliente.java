public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println(cliente.getIdade());
        System.out.println(cliente.getNome());
        }

public class Cliente {
    private int idade;
    private String nome;
}