package Classes;
public class Pessoa {

    /* Atributos
       Modificadores de acesso como "private" - a classe deve encapsular seus atributos (obj gerencia suas infos)
    */
    private float peso;
    private float altura;

    /* Método contrutor - é chamado ao se instanciar um objeto e tem o mesmo nome da classe
       É executado ao se instanciar um objeto (em "nem Pessoa" do método Main)
    */
    public Pessoa(float peso, float altura){
        this.peso = peso;
        this.altura = altura;
    }

    // Modificador de acesso (public) + formato retorno método (float)
    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }

    /* Como os atributos estão privados, a classe deve disponibilizar método para acesso de suas informações
       Métodos acessores - Getters e Setters
    */
    public void setPeso(float peso){
        this.peso = peso;
    }

    public float getPeso(){
        return peso;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getAltura(){
        return altura;
    }

}
