import java.time.LocalDate;
import java.util.Date;

public class Paciente {
    String nome;
    String sobrenome;
    String historiaClinica;
    Date dataInternacao;
    Date dataAlta;


    Paciente(String nome, String sobrenome, String historiaClinica, Date dataInternacao) throws PacienteException
    {   Date hoje= new Date();
        this.nome=nome;
        this.sobrenome=sobrenome;
        dataAlta=null;
        if (dataInternacao.before(hoje))
            this.dataInternacao=dataInternacao;
        else
            throw new PacienteException("Data inválida, data anterior dá de hoje");
    }

    public Date getDataInternacao() {
        return dataInternacao;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void darAlta(Date dataAlta) throws PacienteException
    {
        if (dataAlta.after(dataInternacao))
            System.out.println("Ok");
        else
            throw new PacienteException("Data inválida, data anterior dá de internação");
    }
}
