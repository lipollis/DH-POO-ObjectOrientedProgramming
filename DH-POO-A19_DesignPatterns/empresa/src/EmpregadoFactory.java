public class EmpregadoFactory {

    // PADRÃO SINGLETON
    // atributo
    private static EmpregadoFactory instance;
    //construtor
    private EmpregadoFactory() {}
    //verificação
    public static EmpregadoFactory getInstance(){
        if (instance == null)
            instance = new EmpregadoFactory();
        return instance;
    }

    // PADRÃO FACTORY
    public Empregado criarEmpregado(String tipo){
        if (tipo.equals("R")){
            return new EmpregadoRelacaoDep();
        } else if (tipo.equals("C")){
            return new EmpregadoContratado();
        } else{
            return null;
        }
    }
}
