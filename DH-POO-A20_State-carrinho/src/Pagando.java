public class Pagando implements Estado{

    // CONSTRUTOR
    private Carrinho c;

    public Pagando(Carrinho c) {
        this.c = c;
    }

    // CHAMANDO OS MÉTODOS (IMPLEMENTAÇÃO)
    @Override
    public void addProduto(Produto p) {
        System.out.println("Não aceita mais produtos.");
    }

    @Override
    public void cancelar() {
        c.setEstado(new Vazio(c));
        c.getListaDeProdutos().clear();
    }

    @Override
    public void retornar() {
        c.setEstado(new Carregando(c));
    }

    @Override
    public void seguir() {
        c.setEstado(new Fechado(c));
    }

    // toString, retorna a string
    @Override
    public String toString() {
        return "Pagando";
    }
}
