public class PacienteException extends Exception {
    public PacienteException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Erro na classe: "+ getClass().getName() + ", com a messagem: " + getMessage();
    }
}
