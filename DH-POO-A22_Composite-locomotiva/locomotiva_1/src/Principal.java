public class Principal {
    public static void main(String[] args) {
        Calcular circulo1 = new Circulo(1);
        Calcular circulo2 = new Circulo(2);
        Calcular circulo3 = new Circulo(3);
        System.out.println(circulo1.calcularArea());
        Retangulo retangulo = new Retangulo(5,4);
        Triangulo triangulo = new Triangulo(2,2);
        Locomotiva locomotiva = new Locomotiva();
        locomotiva.addLocomotiva(retangulo);
        locomotiva.addLocomotiva(triangulo);
        locomotiva.addLocomotiva(circulo1);
        locomotiva.addLocomotiva(circulo2);
        locomotiva.addLocomotiva(circulo3);
        System.out.println(locomotiva.calcularArea());

        Locomotiva locomotiva2 = new Locomotiva();
        Retangulo retangulo2 = new Retangulo(6,4);
        Triangulo triangulo2 = new Triangulo(2,2);
        Circulo circulo4 = new Circulo(1);
        Circulo circulo5 = new Circulo(1);
        locomotiva2.addLocomotiva(retangulo2);
        locomotiva2.addLocomotiva(triangulo2);
        locomotiva2.addLocomotiva(circulo4);
        locomotiva2.addLocomotiva(circulo5);
        System.out.println(locomotiva2.calcularArea());

    }
}
