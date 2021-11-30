package entities;

public abstract class Embarcacao {
    private double precoBase;
    private double valorAdicional;
    private int anoFabricacao;
    private double comprimento;
    private Capitao capitao;

    public Embarcacao(double precoBase, int anoFabricacao, double comprimento, Capitao capitao) {
        this.precoBase = precoBase;
        if(anoFabricacao >= 2020){
            this.valorAdicional = precoBase*0.05;
        }
        else {
            this.valorAdicional = 0;
        }
        this.anoFabricacao = anoFabricacao;
        this.comprimento = comprimento;
        this.capitao = capitao;
    }

    public void calcularAluguel(){
        double result = this.precoBase+this.valorAdicional;
        System.out.println("O valor do aluguel é:"+result);
    }
}
