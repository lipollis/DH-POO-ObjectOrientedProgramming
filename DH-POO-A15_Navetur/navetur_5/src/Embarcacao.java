public abstract class  Embarcacao {
   private Capitao capitao;
   private double valorBase;
   private int anoFabricacao;
   private double comprimento;

    public Embarcacao(Capitao capitao, double valorBase, int anoFabricacao, double comprimento) {
        this.capitao = capitao;
        this.valorBase = valorBase;
        this.anoFabricacao = anoFabricacao;
        this.comprimento = comprimento;
    }

    public void valorAluguel() {
        if(this.anoFabricacao < 2020)
            System.out.println("O valor do aluguel é de " + this.valorBase);
        else
            System.out.println("O valor do aluguel é de " + (this.valorBase + 100));
    }

    @Override
    public String toString() {
        return "Embarcacao{" +
                "capitao=" + capitao +
                ", valorBase=" + valorBase +
                ", anoFabricacao=" + anoFabricacao +
                ", comprimento=" + comprimento +
                '}';
    }
}
