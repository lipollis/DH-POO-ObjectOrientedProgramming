import entities.Asteroide;
import entities.Nave;

public class Main {
    public static void main(String[] args) {
        Nave nave = new Nave (10, 5, 'N', 22.34); // Nave instanciada na direção NORTE
        Asteroide asteroide = new Asteroide (10, 8, 'S', 21);

        System.out.println(nave.direcao); // Printa direção NORTE
        nave.irA(10, 11, 'S'); // A nave muda de direção para o SUL.

        System.out.println(nave.girar('O')); // Método de girar a nave. Retorna string informando a direção anterior e a atual.
        System.out.println(nave.direcao); // Checagem da alteração da direção da nave.

        System.out.println(nave.restaVida(10)); // A nave instanciada começa, em default, com 100 de vida.
        System.out.println(asteroide.direcao); // Verificação da direção do asteroide.

        asteroide.irA(8, 11, 'L'); // Alteração da direção do asteroide
        System.out.println(asteroide.direcao); // Checagem da alteração da direção do asteroide.

    }
}
