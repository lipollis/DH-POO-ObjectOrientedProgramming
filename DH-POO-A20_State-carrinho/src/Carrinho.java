import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    // ATRIBUTO
    private Estado estado;
    private List<Produto> listaDeProdutos = new ArrayList<>();

    public Carrinho(){
        this.estado = new Vazio(this);
    }
    // CONSTRUTOR
    public Carrinho(Estado estado) {
        this.estado = estado;
    }

    // GETTER E SETTER
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setListaDeProdutos(Produto p) {
        listaDeProdutos.add(p);
    }

    public List<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    // MÉTODOS
    public void addProduto(Produto p){
        getEstado().addProduto(p);
    }
    public void cancelar(){
        getEstado().cancelar();
    }
    public void retornar(){
        getEstado().retornar();
    }
    public void seguir(){
        getEstado().seguir();
    }

    // toString
    @Override
    public String toString() {
        return "Carrinho{" +
                "estado=" + this.getEstado() +
                ", listaDeProdutos=" + this.listaDeProdutos +
                '}';
    }

}
