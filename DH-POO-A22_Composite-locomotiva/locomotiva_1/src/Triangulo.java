public class Triangulo implements Calcular{

    // ATRIBUTO
    private double base;
    private double altura;

    // CONSTRUTOR
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // MÉTODO DA INTERFACE
    @Override
    public double calcularArea() {
        return (this.base*this.altura/2);
    }
}
