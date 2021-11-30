public class Produto implements Item {
    // ATRIBUTOS
    private String nome;
    private double preco;

    // CONSTRUTOR
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // MÉTODO DA INTERFACE
    @Override
    public double calcularPreco() {
        return this.preco;
    }
}
