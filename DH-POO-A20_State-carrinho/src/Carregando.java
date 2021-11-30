public class Carregando implements Estado{

    // CONSTRUTOR
    private Carrinho c;

    public Carregando(Carrinho c) {
        this.c = c;
    }

    // CHAMANDO OS MÉTODOS (IMPLEMENTAÇÃO)
    @Override
    public void addProduto(Produto p) {
        c.setListaDeProdutos(p);
    }

    @Override
    public void cancelar() {
        c.setEstado(new Vazio(c));
        c.getListaDeProdutos().clear();
    }

    @Override
    public void retornar() {
        c.setEstado(new Vazio(c));
        c.getListaDeProdutos().clear();
    }

    @Override
    public void seguir() {
        c.setEstado(new Pagando(c));
    }

    // toString, retorna a string
    @Override
    public String toString() {
        return "Carregando";
    }
}
