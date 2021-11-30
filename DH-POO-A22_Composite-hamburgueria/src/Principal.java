public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("X-tudo",20.0);
        Produto produto2 = new Produto("Batata frita",25.0);
        Combo combo = new Combo();

        combo.addProduto(produto);
        combo.addProduto(produto2);
        combo.calcularPreco();
        System.out.println(combo.calcularPreco());
    }
}
