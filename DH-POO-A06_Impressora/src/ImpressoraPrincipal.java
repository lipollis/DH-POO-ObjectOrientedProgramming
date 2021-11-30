import java.time.LocalDate;

public class ImpressoraPrincipal {
    public static void main(String[] args) {

        Impressora impressora = new Impressora("epon", "wifi", LocalDate.of(2021, 8, 20));
        // System.out.println(impressora.getDataFabricacao());
        impressora.setFolhasDisponiveis(100);
        impressora.imprimir("OlÃ¡ mundo!");
        System.out.println(impressora.getFolhasDisponiveis());
    }
}
