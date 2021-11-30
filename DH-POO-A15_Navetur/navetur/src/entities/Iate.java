package entities;

public class Iate extends Embarcacao implements Comparable<Iate>{

    private int cabines;

    public Iate(double precoBase, double adicional, int anoFabricacao, double comprimento, Capitao capitao, int cabines) {
        super(precoBase, adicional, anoFabricacao, comprimento, capitao);
        this.cabines = cabines;
    }

    @Override
    public void CalcularAluguel() {
        super.CalcularAluguel();
    }

    /*@Override
    public int getCabines() {
        return cabines;
    }*/

    public void setCabines(int cabines) {
        this.cabines = cabines;
    }

    @Override
    public int compareTo(Iate iate) {
        if (this.cabines == iate.cabines)
            return 0;
        else if(this.cabines> iate.cabines)
            return 1;
        else
            return -1;

    }
}
