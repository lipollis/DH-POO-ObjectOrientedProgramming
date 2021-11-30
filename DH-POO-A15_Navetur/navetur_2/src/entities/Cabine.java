package entities;

public class Cabine {
    private int qtdJanela;
    private int qtdTv;
    private boolean jacuzzi;

    public Cabine(int qtdJanela, int qtdTv, boolean jacuzzi) {
        this.qtdJanela = qtdJanela;
        this.qtdTv = qtdTv;
        this.jacuzzi = jacuzzi;
    }
}
