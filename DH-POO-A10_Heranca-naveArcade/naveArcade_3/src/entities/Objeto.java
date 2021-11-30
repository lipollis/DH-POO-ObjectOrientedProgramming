package entities;

public class Objeto {
    private int posX;
    private int posY;
    public char direcao;

    Objeto (int x, int y, char direcao) {
        this.posX = x;
        this.posY = y;
        this.direcao = direcao;
    }

    public void irA (int x, int y, char direcao) {
        this.posX = x;
        this.posY = y;
        this.direcao = direcao;
    }
}
