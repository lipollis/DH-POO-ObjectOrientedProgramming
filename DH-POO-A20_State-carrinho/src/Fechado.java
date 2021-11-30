public class Fechado implements Estado{

    // CONSTRUTOR
    private Carrinho c;

    public Fechado(Carrinho c) {
        this.c = c;
    }

    // CHAMANDO OS MÉTODOS (IMPLEMENTAÇÃO)
    @Override
    public void addProduto(Produto p) {
        System.out.println("Não aceita mais produtos.");
    }

    @Override
    public void cancelar() {
        System.out.println("Compra concluída.");
    }

    @Override
    public void retornar() {
        System.out.println("Não aceita mais produtos.");
    }

    @Override
    public void seguir() {
        c.setEstado(new Vazio(c));
    }

    // toString, retorna a string
    @Override
    public String toString() {
        return "Fechado";
    }
}
