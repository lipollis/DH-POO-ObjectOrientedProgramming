package entities;

public class Cliente {
    private int numCliente;
    private String sobrenome;
    //private String rg;
    private String cpf;

    public Cliente (int numCliente, String sobrenome, String cpf) {
        this.numCliente = numCliente;
        this.sobrenome = sobrenome;
        //this.rg = rg;
        this.cpf = cpf;
    }
}
