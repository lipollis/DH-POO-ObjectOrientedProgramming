import entities.Cabine;
import entities.Capitao;
import entities.Mastro;
import entities.Veleiro;

public class Main {
    public static void main(String[] args) {
        Capitao capitao1 = new Capitao("Yana", "Medalha de ouro", "1234");
        Mastro mastro1 = new Mastro("Madeira", 2, "Azul");
        Mastro mastro2 = new Mastro("Metal", 1, "Verde");
        Veleiro veleiro = new Veleiro(1000.5, 2019, 30.5, capitao1);
        veleiro.addMastro(mastro1);
        veleiro.addMastro(mastro2);
        System.out.println(veleiro.verificarVeleiro());
        veleiro.calcularAluguel();

        Cabine cabine1 = new Cabine(10, 2, true);
        Cabine cabine2 = new Cabine(20, 1, false);
        Iate iate1 = new Iate(100000, 2020, 50, capitao1);
        iate1.addCabine(cabine1);
        iate1.addCabine(cabine2);
        Cabine cabine3 = new Cabine(10, 1, true);
        Iate iate2 = new Iate(99999, 2021, 40, capitao1);
        iate2.addCabine(cabine1);
        iate2.addCabine(cabine2);
        iate2.addCabine(cabine3);
        iate2.calcularAluguel();
        System.out.println(iate1.compareTo(iate2));
    }
}
