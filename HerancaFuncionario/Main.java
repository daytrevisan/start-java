package HerancaFuncionario;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Vendedor v = new Vendedor();
        v.setNome("Joao");
        v.setCpf("123.456.789-00");
        v.setDataNascimento(new Date());
        v.setSalario(2000.0f);
        v.setComissaoPorItem(25.0f);
        v.setTotalItensVendidos(10);

        System.out.println("O salário do vendedor é: " + v.calcularSalario());

        Motorista m = new Motorista();
        m.setNome("José");
        m.setCpf("");
        m.setDataNascimento(new Date());
        m.setSalario(1200.0f);
        m.setDistanciaPercorrida(250.0f);
        m.setCustoPorKm(15.0f);

        System.out.println("O salário do motorista é: " + m.calcularSalario());

    }
}