package entities;

public class Secretaria extends Funcionario{

    private double salario;

    public Secretaria(String nome, String sobrenome, String cpf, double salario) {
        super(nome, sobrenome, cpf, salario);
        this.salario = salario;
    }

    @Override
    public void pagamento() {
        System.out.println("Seu pagamento será de " + getSalario());
    }
}
