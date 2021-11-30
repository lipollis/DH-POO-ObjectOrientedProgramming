package entities;

import java.util.ArrayList;
import java.util.List;

public class Veleiro extends Embarcacao{
    private List<Mastro> mastro= new ArrayList<>();

    public Veleiro(double precoBase, int anoFabricacao, double comprimento, Capitao capitao) {
        super(precoBase, anoFabricacao, comprimento, capitao);
    }

    public String verificarVeleiro(){
        int result = mastro.size();
        if(result > 4) {
            return "O veleiro é grande, e tem: "+result+" mastros";
        }
        return "O veleiro é pequeno, e tem: "+result+" mastros";
    }

    public void addMastro(Mastro mastro){
        this.mastro.add(mastro);
    }
}
