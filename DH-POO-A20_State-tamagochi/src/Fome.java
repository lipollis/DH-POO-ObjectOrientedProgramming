public class Fome implements Estado{

    // ATRIBUTO
    private Tamagochi t;

    // CONSTRUTOR
    public Fome(Tamagochi t){
        this.t = t;}

    // CHAMANDO OS MÉTODOS (IMPLEMENTAÇÃO)
    @Override
    public void come() {
        t.setEstado(new Feliz(t));
    }

    @Override
    public void bebe() {
        t.setEstado(new Feliz(t));System.out.println("Beep Beep Beep - pisca");
    }

    @Override
    public void carinho() {
        System.out.println("cut cut");
    }
}
