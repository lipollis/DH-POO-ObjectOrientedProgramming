import java.util.ArrayList;

public class Vagao implements Calculadora{

    ArrayList<Calculadora> formas;

    public Vagao() {
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
        System.out.println("Area vagao:");
        return area;
    }
}
