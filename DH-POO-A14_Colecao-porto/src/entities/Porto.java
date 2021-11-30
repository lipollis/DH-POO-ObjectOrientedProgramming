package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Porto {
    private  String nome;

    public Porto(String nome) {
        this.nome = nome;
    }

    private List<Container> listaConteiners = new ArrayList<>();

    public void addConteiner(Container container){
        listaConteiners.add(container);
    }

    public void mostrarConteiner(){
        Collections.sort(listaConteiners);
        for (Container container: listaConteiners){
            System.out.println("NÃºmero Conteiner: " + container.getNumID());

        }
    }

    public int getConteinersPerigosos(){
        int quantPerigoso = 0;
        for (Container container: listaConteiners){
            if (container.isPerigoso() && container.getPaisOrigem().equals("Desconhecido")){
                quantPerigoso++;
            }
        }
        return  quantPerigoso;

    }
}
