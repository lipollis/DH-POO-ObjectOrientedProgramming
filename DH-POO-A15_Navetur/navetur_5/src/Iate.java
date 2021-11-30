public class Iate extends Embarcacao implements Comparable<Iate>{
    private int qtdCabine;

    public Iate(Capitao capitao, double valorBase, int anoFabricacao, double comprimento, int qtdCabine) {
        super(capitao, valorBase, anoFabricacao, comprimento);
        this.qtdCabine = qtdCabine;
    }


    @Override
    public int compareTo(Iate iate) {
        if(this.qtdCabine == iate.qtdCabine)
            return 0;
        else if(this.qtdCabine > iate.qtdCabine)
            return -1;
        else
            return 1;
    }

    @Override
    public String toString() {
        return "Iate{" +
                "qtdCabine=" + qtdCabine +
                "} " + super.toString();
    }
}
