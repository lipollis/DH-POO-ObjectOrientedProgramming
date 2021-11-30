package entities;

public class MesaNave extends MesaObjeto{
    private double velocidade;
    private int vida;

    public MesaNave(int X, int Y, char direcao, double velocidade, int vida){
        super(X, Y, direcao);
        this.velocidade = velocidade;
        this.vida = vida;
    }

    public void girar(char direcao){
        System.out.println("Direção: "+direcao);
    }

    public String restaVida (int valor){
        return "Vidas: " + valor;
    }

    @Override
    public String toString() {
        return "MesaNave{" +
               "velocidade=" + velocidade +
               ", vida=" + vida +
               '}';
    }
}
