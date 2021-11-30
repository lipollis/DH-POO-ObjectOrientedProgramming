public class Triste implements Estado{


    // CONSTRUTOR
    private Tamagochi t;
    public Triste (Tamagochi t){
        this.t = t;
    }

    // CHAMANDO OS MÉTODOS (IMPLEMENTAÇÃO)
    @Override
    public void come() {
        System.out.println("Beep Beep - vomitando");
    }

    @Override
    public void bebe() {
        System.out.println("Beep Beep Beep - pisca");
    }

    @Override
    public void carinho() {
         t.setEstado(new Feliz(t));
    }
}
