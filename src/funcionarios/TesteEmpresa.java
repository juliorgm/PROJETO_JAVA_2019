package funcionarios;

public class TesteEmpresa {
    public static void main(String[] args) {
        Empresa senac = new Empresa("SENAC","123213213",5);

        senac.adicionaFuncionario(new Funcionario(
                "Julio","123","Instrutores"
                ,"01/02/2011",1700));

        senac.adicionaFuncionario(new Funcionario(
                "Eduardo","321","Apoio"
                ,"01/02/2016",1200));
        senac.adicionaFuncionario(new Funcionario(
                "Eduardo","321","Apoio"
                ,"01/02/2016",1200));
        senac.adicionaFuncionario(new Funcionario(
                "Eduardo","321","Apoio"
                ,"01/02/2016",1200));


        senac.exibeTodosFuncionarios();
    }
}
