public class Tamagochi {
    // ATRIBUTO
    private Estado estado;

    // CONSTRUTOR
    public Tamagochi(){
        setEstado(new Fome(this));
    }

    // GETTER E SETTER
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    // MÉTODOS
    public void come(){
        getEstado().come();
    }

    public void bebe(){
        getEstado().bebe(); //para retornar o estado
    }

    public void carinho(){
        getEstado().carinho();
    }
}
