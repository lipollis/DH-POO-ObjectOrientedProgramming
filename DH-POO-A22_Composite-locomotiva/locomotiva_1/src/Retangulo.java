public class Retangulo implements Calcular{
    // ATRIBUTO
    private double altura;
    private double comprimento;

    // CONSTRUTOR
    public Retangulo(double altura, double comprimento) {
        this.altura = altura;
        this.comprimento = comprimento;
    }

    // MÉTODO DA INTERFACE
    @Override
    public double calcularArea() {
        return this.altura*this.comprimento;
    }


}
