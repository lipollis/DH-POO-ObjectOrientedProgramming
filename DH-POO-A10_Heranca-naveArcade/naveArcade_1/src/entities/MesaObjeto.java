package entities;

public class MesaObjeto {
    private int posX;
    private int posY;
    private char direcao;

    MesaObjeto(int X, int Y, char direcao){
        this.posX = X;
        this.posY = Y;
        this.direcao = direcao;
    }

    public void irA (int X, int Y, char direcao){
        this.posX = X;
        this.posY = Y;
        this.direcao = direcao;
    }
}
