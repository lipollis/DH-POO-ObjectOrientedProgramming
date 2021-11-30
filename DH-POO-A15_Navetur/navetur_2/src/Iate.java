import entities.Cabine;
import entities.Capitao;
import entities.Embarcacao;

import java.util.ArrayList;
import java.util.List;

public class Iate  extends Embarcacao implements Comparable{
    private List<Cabine> cabines = new ArrayList<>();

    public Iate(double precoBase, int anoFabricacao, double comprimento, Capitao capitao) {
        super(precoBase, anoFabricacao, comprimento, capitao);
    }

    public List<Cabine> getCabines() {
        return cabines;
    }

    public void addCabine(Cabine cabine){
        this.cabines.add(cabine);
    }

    @Override
    public int compareTo(Iate iate) {
        if(this.cabines.size() == iate.getCabines().size()){
            return 0;
        }
        else if(this.cabines.size() > iate.getCabines().size()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
