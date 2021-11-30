public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Thays", "Gama", "000", 100);

        try {
            cliente.comprar(500);
        } catch (ClienteException e) {
            e.printStackTrace();
            System.err.println(e.toString());
        }

    }
}
