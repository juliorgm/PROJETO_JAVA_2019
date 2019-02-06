package funcionarios;

import java.util.Arrays;

public class Empresa {
    private String nomeEmpresa;
    private String cnpjEmpresa;
    private Funcionario Funcionarios[];
    private int numeroFuncionariosAdicionados;

    public Empresa(String nomeEmpresa, String cnpjEmpresa, int numeroFuncionarios) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpjEmpresa = cnpjEmpresa;
        Funcionarios = new Funcionario[numeroFuncionarios];
    }

    public void adicionaFuncionario(Funcionario funcionario) {
        this.Funcionarios[numeroFuncionariosAdicionados] = funcionario;
        numeroFuncionariosAdicionados++;
    }

    public void exibeTodosFuncionarios() {
        for (int i = 0; i < numeroFuncionariosAdicionados; i++) {
            System.out.println(this.toString());
            System.out.println("================================");
            System.out.println(Funcionarios[i].toString());
            System.out.println("--------------------------------");
        }
    }

    @Override
    public String toString() {
        return "\nEmpresa " + nomeEmpresa +
                " CNPJ: " + cnpjEmpresa +
                "\nNúmero de funcionários " + (numeroFuncionariosAdicionados + 1);
    }
}
