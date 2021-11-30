import java.util.ArrayList;

public class Locomotiva implements Calcular{
    // ATRIBUTO
    private ArrayList<Calcular> locomotiva;

    // CONSTRUTOR
    public Locomotiva() {
        //this.locomotiva = new ArrayList<>();
    }

    public void addLocomotiva(Calcular poligono){
        this.locomotiva.add(poligono);
    }


    @Override
    public double calcularArea() {
        double valorTotal = 0;
        for (Calcular poligono : this.locomotiva){
            valorTotal += poligono.calcularArea();
        }
        return valorTotal;
    }
}
