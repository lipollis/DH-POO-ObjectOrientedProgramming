import entities.Empresa;
import entities.Funcionario;
import entities.Gerente;

public class Main {
    public static void main(String[] args) {
        Empresa dh = new Empresa("DH", "68525");
        Funcionario funcionario1 = new Gerente("José", "Silva", "55555", 10000, 500);

        dh.cadastrar(funcionario1);
        dh.listar();
        funcionario1.pagamento();
        dh.remover(funcionario1);
        dh.listar();
        //System.out.print(dh);
    }
}
