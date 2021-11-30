package entities;

public class MesaAsteroide extends MesaObjeto{
    private final int danos;

    public MesaAsteroide(int X, int Y, char direcao, int danos){
        super(X, Y, direcao);
        this.danos = danos;
    }

    @Override
    public String toString() {
        return "MesaAsteroide{" +
               "danos=" + danos +
               '}';
    }
}
