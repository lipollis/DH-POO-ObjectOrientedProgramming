
public class Veleiro extends Embarcacao{
    private int qtdMastro;

    public Veleiro(Capitao capitao, double valorBase, int anoFabricacao, double comprimento, int qtdMastro) {
        super(capitao, valorBase, anoFabricacao, comprimento);
        this.qtdMastro = qtdMastro;
    }

    public void grande(){
        if(this.qtdMastro > 4)
            System.out.println("O veleiro  é grande.");
        else
            System.out.println("O veleiro não é grande.");
    }

    @Override
    public String toString() {
        return "Veleiro{}";
    }
}
