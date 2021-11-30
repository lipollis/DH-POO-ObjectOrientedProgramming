package entities;

public abstract class Funcionario {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private String matricula;
    private double salario;

    public Funcionario(String nome, String sobrenome, String cpf, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public abstract void pagamento();

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
               "nome='" + nome + '\'' +
               ", sobrenome='" + sobrenome + '\'' +
               ", cpf='" + cpf;
    }
}
