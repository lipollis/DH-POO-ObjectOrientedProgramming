package entities;

public class Cliente {
    // ATRIBUTOS
    private int numeroCliente;
    private String nome;
    private double divida;

    // CONSTRUTOR
    public Cliente(int numeroCliente, String nome){
        this.numeroCliente = numeroCliente;
        this.nome = nome;
        this.divida = 0;
    }

    // GETTER & SETTER
    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double aumentarDivida(double valor){
        this.divida = divida + valor;
        return this.divida;

    }

    public String pagarDivida(){
        this.divida = 0;
        return "Sua divida foi paga";
    }
}
