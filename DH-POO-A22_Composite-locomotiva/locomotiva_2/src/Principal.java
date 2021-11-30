public class Principal {
    public static void main(String[] args) {

        //Criando objetos locomotiva
        Circulo circulo1 = new Circulo(1);
        Circulo circulo2 = new Circulo(1);
        Retangulo retangulo1 = new Retangulo(6, 4);
        Triangulo triangulo1 = new Triangulo(2,2);

        //Criando locomotiva
        Locomotiva locomotiva1 = new Locomotiva();

        locomotiva1.addForma(circulo1);
        locomotiva1.addForma(circulo2);
        locomotiva1.addForma(retangulo1);
        locomotiva1.addForma(triangulo1);

        System.out.println(locomotiva1.calcularArea());

        //Criando objetos vagao
        Retangulo retangulo2 = new Retangulo(5, 4);
        Circulo circulo3 = new Circulo(1);
        Circulo circulo4 = new Circulo(1);
        Circulo circulo5 = new Circulo(1);

        //Criando locomotiva
        Vagao vagao1 = new Vagao();

        vagao1.addForma(retangulo2);
        vagao1.addForma(circulo3);
        vagao1.addForma(circulo4);
        vagao1.addForma(circulo5);

        System.out.println(vagao1.calcularArea());
    }
}
