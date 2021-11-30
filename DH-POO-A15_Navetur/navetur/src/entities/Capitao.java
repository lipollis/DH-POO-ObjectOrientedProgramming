package entities;

public class Capitao {
    private String nome;
    private String apelido;
    private int registroNavegacao;

    public Capitao(String nome, String apelido, int registroNavegacao) {
        this.nome = nome;
        this.apelido = apelido;
        this.registroNavegacao = registroNavegacao;
    }

    @Override
    public String toString() {
        return "Capitao{" +
                "nome='" + nome + '\'' +
                ", apelido='" + apelido + '\'' +
                ", registroNavegacao=" + registroNavegacao +
                '}';
    }
}
