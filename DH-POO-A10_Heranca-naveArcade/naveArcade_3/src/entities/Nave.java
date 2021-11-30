package entities;

public class Nave extends Objeto {
    private double velocidade;
    private int vida;

    public Nave(int claudia, int joana, char direcao, double velocidade) {
        super(claudia, joana, direcao);
        this.velocidade = velocidade;
        this.vida = 100;
    }

    public String girar (char direcao) {
        return "A nave saiu da direção " + this.direcao + " e girou para a direção " + (this.direcao = direcao) + ".";

    }

    public String restaVida (int valor) {
        this.vida -= valor;

        return "A nave tem, atualmente, " + this.vida + " pontos de vida.";
    }
}
