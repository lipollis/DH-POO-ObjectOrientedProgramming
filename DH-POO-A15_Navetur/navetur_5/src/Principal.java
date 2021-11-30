public class Principal {
    public static void main(String[] args) {
       Empresa empresa1 = new Empresa("NavTur");
       Capitao capitao1 = new Capitao("Edu", "Araujo", 112);
       Veleiro veleiro1 = new Veleiro(capitao1, 1250, 2020, 100, 2);
       Iate iate1 = new Iate(capitao1, 1000, 2015, 50, 10);
       Iate iate2 = new Iate(capitao1, 1300, 2015, 50, 5);
       Iate iate3 = new Iate(capitao1, 1412, 2015, 50, 1);

       empresa1.cadastrarIate(iate1);
       empresa1.cadastrarIate(iate2);
       empresa1.cadastrarIate(iate3);
       empresa1.cadastrarVeleiro(veleiro1);

       empresa1.mostrarIate();
       veleiro1.valorAluguel();
       iate1.valorAluguel();
       veleiro1.grande();

    }
}
