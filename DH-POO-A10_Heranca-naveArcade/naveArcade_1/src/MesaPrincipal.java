import entities.MesaAsteroide;
import entities.MesaNave;

public class MesaPrincipal {
    public static void main(String[] args) {
        MesaNave mesaNave = new MesaNave(10, 5, 'N', 22.34, 50);
        MesaAsteroide mesaAsteroide = new MesaAsteroide(10, 8, 'S', 21);

        System.out.println(mesaNave);

        System.out.println(mesaNave.restaVida(10));

        System.out.println(mesaAsteroide);
    }
}
