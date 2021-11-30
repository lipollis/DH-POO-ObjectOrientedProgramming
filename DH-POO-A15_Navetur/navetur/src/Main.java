import entities.Capitao;
import entities.Embarcacao;
import entities.Iate;
import entities.Veleiro;

public class Main {
    public static void main(String[] args) {
        Capitao felipe = new Capitao("Felipe", "cape", 200);
        Capitao mario = new Capitao("Mario", "Biondo", 220);
        Capitao marcelo = new Capitao("Marcelo","Miyoshi",250);

        Embarcacao primeiro = new Iate(100, 10, 2021, 500, felipe, 2);
        Embarcacao segundo = new Iate(150,20,2020,500,mario,4);
        Embarcacao terceiro = new Iate(200,50,2021,400,marcelo,7);

        Embarcacao quarto = new Veleiro(100, 10, 2021, 500, felipe, 2);
        Embarcacao quinto = new Veleiro(150,20,2020,500,mario,4);
        Embarcacao sexto = new Veleiro(200,50,2021,400,marcelo,7);

        System.out.println(primeiro);
        System.out.println(segundo);
        System.out.println(terceiro);
        System.out.println(quarto);
        System.out.println(quinto);
        System.out.println(sexto);

    }
}
