public class Feliz implements Estado{

    // CONSTRUTOR
    Tamagochi t;
    public Feliz (Tamagochi t){
        this.t = t;
    }

    // CHAMANDO OS MÉTODOS (IMPLEMENTAÇÃO)
    @Override
    public void come() {
        System.out.println("Come come");
    }

    @Override
    public void bebe() {
        System.out.println("Beep Beep Beep Beep Beep");
    }

    @Override
    public void carinho() {
        System.out.println("cut cut");
    }
}
