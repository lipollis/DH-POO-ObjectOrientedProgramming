import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Empresa {
     private String nome;
     private List<Veleiro> listarVeleiro = new ArrayList<>();
     private List<Iate> listarIate = new ArrayList<>();

     public Empresa(String nome) {
          this.nome = nome;
     }

     public void cadastrarVeleiro(Veleiro veleiro){
          listarVeleiro.add(veleiro);
     }
     public void cadastrarIate(Iate iate){
          listarIate.add(iate);
     }


     public void mostrarIate(){
          Collections.sort(listarIate);
          for (Iate iate: listarIate){
               System.out.println("Iate: " + iate);
          }
     }
}
