public class Principal {
    public static void main(String[] args) {
        Empresa dh = new Empresa("555666");

        EmpregadoFactory factory = EmpregadoFactory.getInstance(); // singleton

        dh.addEmpregado(factory.criarEmpregado("R").setNome("Yana"));

        Empregado c = factory.criarEmpregado("C");
        c.setNome("Silas");
        dh.addEmpregado(c);
        c = factory.criarEmpregado("R");
        dh.addEmpregado(c);

        System.out.println(dh.getListaEmpregados());

    }
}
