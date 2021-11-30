package entities;

public class Associado {
    private String numero;
    private String nome;
    public double valor;
    private String atividade;

    public Associado(String numero, String nome, double valor, String atividade){
        this.numero = numero;
        this.nome = nome;
        this.valor = valor;
        this.atividade = atividade;
    }

    public double custoMensal(){
        return this.valor;
    }

    public double getValor() {
        return valor;
    }
}
