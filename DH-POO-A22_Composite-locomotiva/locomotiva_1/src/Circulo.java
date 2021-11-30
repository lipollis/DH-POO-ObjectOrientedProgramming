public class Circulo implements Calcular{
    // ATRIBUTO
    private double raio;

    // CONSTRUTOR
    public Circulo(double raio) {
        this.raio = raio;
    }

    // MÉTODO DA INTERFACE
    @Override
    public double calcularArea() {
        return (this.raio*this.raio)*Math.PI;
    }
}
