public abstract class Empregado {
    // DECLARAÇÃO DOS ATRIBUTOS (PRIVADOS)
    private String nome;
    private String sobrenome;
    private String arquivo;

    // CONSTRUTOR
    public Empregado(){}
    public Empregado(String nome, String sobrenome, String arquivo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
       this.arquivo = arquivo;
    }

    public abstract Double calcularSalario();

    // toString
    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", arquivo='" + arquivo + '\'' +
                '}';
    }
}
