import entities.Cliente;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(2, "Yana");

        System.out.println(cliente.getNome() + " " +  cliente.getDivida());
        cliente.aumentarDivida(500);
        System.out.println(cliente.getDivida());
    }
}
