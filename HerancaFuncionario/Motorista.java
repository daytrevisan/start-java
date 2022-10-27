package HerancaFuncionario;

public class Motorista extends Funcionario {

    private float distanciaPercorrida;
    private float custoPorKm;

    public Motorista() {
        super();
    }

    public float getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(float distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public float getCustoPorKm() {
        return custoPorKm;
    }

    public void setCustoPorKm(float custoPorKm) {
        this.custoPorKm = custoPorKm;
    }

    public float calcularSalario(){
        return super.getSalario() + (this.getDistanciaPercorrida() * getCustoPorKm());
    }
}