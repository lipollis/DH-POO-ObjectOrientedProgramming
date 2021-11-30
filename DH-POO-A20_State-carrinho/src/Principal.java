public class Principal {
    public static void main(String[] args) {
        // CRIA O CARRINHO
        Carrinho carrinho = new Carrinho();
        System.out.println(carrinho);
        carrinho.setEstado(new Vazio(carrinho));
        // CRIA OS PRODUTOS
        Produto p1 = new Produto("Chocolate", 524, 10, "doce");
        Produto p2 = new Produto("Chocolate", 525, 20, "doce");
        Produto p3 = new Produto("Chocolate", 526, 30, "doce");
        Produto p4 = new Produto("Chocolate", 527, 40, "doce");

        // ADD PRODUTO NO CARRINHO
        carrinho.setEstado(new Carregando(carrinho));
        carrinho.getEstado().addProduto(p1);
        carrinho.getEstado().addProduto(p2);
        carrinho.getEstado().addProduto(p3);
        carrinho.getEstado().addProduto(p4);
        System.out.println(carrinho);
//        carrinho.setListaDeProdutos(p1);
//        carrinho.setListaDeProdutos(p2);
//        carrinho.setListaDeProdutos(p3);
//        carrinho.setListaDeProdutos(p4);
        carrinho.getEstado().seguir();
        System.out.println(carrinho);
    }
}
