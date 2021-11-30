import entities.Associado;
import entities.AssociadoHabilitado;

public class Main {
    public static void main(String[] args) {
        Associado associado = new Associado("123", "Aline", 99, "Musculação");
        AssociadoHabilitado associadoHabilitado = new AssociadoHabilitado("456", "Regina", "Aeróbico", 99, 25);

        associadoHabilitado.setHabilitado(true);
        associadoHabilitado.valor = 150;

        System.out.println(associado.custoMensal());
        System.out.println(associadoHabilitado.custoMensal());
    }
}
