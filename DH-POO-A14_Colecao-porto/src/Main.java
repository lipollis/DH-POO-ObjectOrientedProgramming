import entities.Container;
import entities.Porto;

public class Main {
    public static void main(String[] args) {
        Container container1 = new Container(14, "Brasil", false);
        Container container2 = new Container(3, "Argentina", true);
        Container container3 = new Container(22, true);

        Porto porto = new Porto("Buenos Aires");

        porto.addConteiner(container1);
        porto.addConteiner(container2);
        porto.addConteiner(container3);

        porto.mostrarConteiner();
        System.out.println(porto.getConteinersPerigosos());

    }
}
