package entities;

public class Asteroide extends Objeto {
    private int danos;

    public Asteroide(int x, int y, char direcao, int danos) {
        super(x, y, direcao);
        this.danos = danos;
    }

    //irA vai ser herdado


    public int getDanos() {
        return danos;
    }

    public void setDanos(int danos) {
        this.danos = danos;
    }
}
