import java.util.ArrayList;

public class Locomotiva implements Calculadora{

    ArrayList<Calculadora> formas;

    public Locomotiva() {
        this.formas = new ArrayList<>();
    }

    public void addForma(Calculadora forma){
        formas.add(forma);
    }

    @Override
    public double calcularArea() {

        double area = 0.0;

        for(Calculadora forma : formas){
            area += forma.calcularArea();
        }
        System.out.println("Area locomotiva: ");
        return area;
    }
}
