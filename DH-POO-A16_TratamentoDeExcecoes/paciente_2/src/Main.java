import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try{
            Paciente paciente=new Paciente("Juan","Perez","12345",
                                           new Date(100+21, 9, 16));
           paciente.darAlta(new Date(100+21, 9, 19));
        }catch (PacienteException err){
           System.err.println(err);
        }

    }

}
