public class Produto implements Estado{
    // ATRIBUTOS
    private  String nome;
    private int codigo;
    private double preco;
    private String descricao;

    // CONSTRUTOR
    public Produto(String nome, int codigo, double preco, String descricao) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.descricao = descricao;
    }

    // CHAMANDO OS MÉTODOS (IMPLEMENTAÇÃO)
    @Override
    public void addProduto(Produto p) {

    }

    @Override
    public void cancelar() {

    }

    @Override
    public void retornar() {

    }

    @Override
    public void seguir() {

    }

    // toString

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
