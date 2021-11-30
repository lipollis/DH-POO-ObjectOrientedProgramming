public class Vazio implements Estado{

    // CONSTRUTOR
    private Carrinho c;

    public Vazio(Carrinho c) {
    this.c = c;
    }

    // CHAMANDO OS MÉTODOS (IMPLEMENTAÇÃO)
    @Override
    public void addProduto(Produto p) {
        System.out.println("Mudando de estado para add produto");
        c.setEstado(new Carregando(c));
        c.addProduto(p);
    }

    @Override
    public void cancelar() {
        System.out.println("Carrinho está vázio.");
    }

    @Override
    public void retornar() {
        System.out.println("Carrinho está vázio.");
    }

    @Override
    public void seguir() {
        c.setEstado(new Carregando(c));
    }

    // toString, retorna a string
    @Override
    public String toString() {
        return "Vazio";
    }
}
