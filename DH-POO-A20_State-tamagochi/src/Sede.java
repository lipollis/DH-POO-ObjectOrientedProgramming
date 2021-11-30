public class Sede implements Estado{

    private Tamagochi t;

    // CONSTRUTOR
    public Sede(Tamagochi t){
        this.t = t;}

    // CHAMANDO OS MÉTODOS (IMPLEMENTAÇÃO)
    @Override
    public void come() {
        System.out.println("Tô com sede");
    }

    @Override
    public void bebe() {
        System.out.println("Vlw fera");
        t.setEstado(new Feliz(t));
    }

    @Override
    public void carinho() {
        System.out.println("Vlw fera 2");
    }
}
