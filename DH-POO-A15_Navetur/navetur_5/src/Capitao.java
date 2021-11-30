public class Capitao {
    private String nome;
    private String sobrenome;
    private int regNav;

    public Capitao(String nome, String sobrenome, int regNav) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.regNav = regNav;
    }

    @Override
    public String toString() {
        return "Capitao{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", regNav=" + regNav +
                '}';
    }
}
