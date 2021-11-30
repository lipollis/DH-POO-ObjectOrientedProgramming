public class EmpregadoRelacaoDep extends Empregado{
    // DECLARAÇÃO DOS ATRIBUTOS (PRIVADOS)
    private double valorMensal;

    // CONSTRUTOR
    public EmpregadoRelacaoDep(){}
    public EmpregadoRelacaoDep(String nome, String sobrenome, String arquivo, double valorMensal) {
        super(nome, sobrenome, arquivo);
        this.valorMensal = valorMensal;
    }

    @Override
    public Double calcularSalario() {
        return this.valorMensal;
    }
}