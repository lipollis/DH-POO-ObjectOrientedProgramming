public class EmpregadoContratado  extends  Empregado{
    // DECLARAÇÃO DOS ATRIBUTOS (PRIVADOS)
    private double imposto;
    private double valorPorHora;

    // CONSTRUTOR
    public EmpregadoContratado(){}
    public EmpregadoContratado(String nome, String sobrenome, String arquivo, double imposto, double valorPorHora) {
        super(nome, sobrenome, arquivo);
        this.imposto = imposto;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public Double calcularSalario() {
        return this.imposto * this.valorPorHora;
    }

}