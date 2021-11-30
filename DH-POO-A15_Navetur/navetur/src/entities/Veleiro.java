package entities;

public class Veleiro extends Embarcacao implements Comparable<Veleiro>{

    private int mastros;

    public Veleiro(double precoBase, double adicional, int anoFabricacao, double comprimento, Capitao capitao, int mastros) {
        super(precoBase, adicional, anoFabricacao, comprimento, capitao);
        this.mastros = mastros;
    }

    @Override
    public void CalcularAluguel() {
        super.CalcularAluguel();
    }

    @Override
    public int compareTo(Veleiro veleiro) {
        return 0;
    }
}
