import java.util.ArrayList;
import java.util.List;
public class Empresa {
    // DECLARAÇÃO DOS ATRIBUTOS (PRIVADOS)
    private String cnpj;
    private List<Empregado> listaEmpregados = new ArrayList<>();

    // CONSTRUTOR
    public Empresa(String cnpj) {
        this.cnpj = cnpj;
    }


    public void addEmpregado(Empregado empregado){

        listaEmpregados.add(empregado);
    }

    // GETTER
    public String getCnpj() {
        return cnpj;
    }

    public List<Empregado> getListaEmpregados() {
        return listaEmpregados;
    }

    public Double calcularSalarioTotal(){
        double salarioTotal = 0.0;
        for(Empregado empregado : listaEmpregados){
            salarioTotal += empregado.calcularSalario();
        }
        return salarioTotal;
    }
}
