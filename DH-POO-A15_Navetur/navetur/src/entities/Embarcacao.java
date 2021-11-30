package entities;

public abstract class Embarcacao {
    private double precoBase;
    private double adicional;
    private int anoFabricacao;
    private double comprimento;
    private Capitao capitao;

    public Embarcacao(double precoBase, double adicional, int anoFabricacao, double comprimento, Capitao capitao) {
        this.precoBase = precoBase;
        this.adicional = adicional;
        this.anoFabricacao = anoFabricacao;
        this.comprimento = comprimento;
        this.capitao = capitao;
    }

    public void CalcularAluguel(){
        if (anoFabricacao > 2020){
            double total = precoBase + adicional;
            System.out.println("O valor do aluguel fica: " + total);
        }
        else {
            double total = precoBase;
            System.out.println("O valor do aluguel fica: " + total);
        }
    }

    @Override
    public String toString() {
        return "Embarcacao{" +
                "precoBase=" + precoBase +
                ", adicional=" + adicional +
                ", anoFabricacao=" + anoFabricacao +
                ", comprimento=" + comprimento +
                ", capitao=" + capitao +
                '}';
    }
}
