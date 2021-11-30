import java.util.ArrayList;

public class Combo implements Item {
    // ATRIBUTOS
    private ArrayList<Item> listaProdutos;

    // CONSTRUTOR
    public Combo(){
        this.listaProdutos = new ArrayList<>();
    }

    //
    public void addProduto(Item item){
        this.listaProdutos.add(item);
    }

    // MÉTODO DA INTERFACE
    @Override
    public double calcularPreco() {
        double valorTotal = 0.0;
        for (Item item: listaProdutos){
            valorTotal += item.calcularPreco();
        }
        return valorTotal;
    }
}
