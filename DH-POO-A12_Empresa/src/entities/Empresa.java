package entities;

import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String cnpj;
    private ArrayList<Funcionario> listaFuncionario = new ArrayList<>();


    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void cadastrar(Funcionario funcionario){
        listaFuncionario.add(funcionario);
        System.out.print("Funcionário foi cadastrado com sucesso!!");
    }

    public void listar(){
        for (int i = 0; i < listaFuncionario.size();i++){
            System.out.print(listaFuncionario.get(i));
        }
    }

    public void remover(Funcionario funcionario){
        System.out.print(listaFuncionario.remove(funcionario));
        //System.out.print("Funcionário "+ funcionario.getNome()+"foi removido");
    }
}
