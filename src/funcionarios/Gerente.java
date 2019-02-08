package funcionarios;

public class Gerente extends Funcionario{
    public static final int PORCENTAGEM = 100;
    private static final double VALOR_MINIMO_BONIFICACAO = 0.15;
    private int senha;
    private int numeroFuncionarios;

    public Gerente(String nomeFuncionario, String rgFuncionario, String departamento,
                   String dataEntrada, double salario, int numeroFuncionarios,
                    int senha) {
        super(nomeFuncionario, rgFuncionario, departamento, dataEntrada, salario);
        this.numeroFuncionarios = numeroFuncionarios;
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if (this.senha == senha) {
            System.out.println("Autenticado com sucesso!");
            return true;
        }
        System.out.println("Senha errada!");
        return false;
    }

    @Override
    public double calculaComissao(int comissao) {
        return super.calculaComissao(comissao * 2);
    }

    @Override
    public double recebeBonificacao() {
        return super.calculaGanhoAnual()*VALOR_MINIMO_BONIFICACAO;
    }

    public double calculaComissao(double porcentagemComissao) {
        return this.salario*porcentagemComissao/ PORCENTAGEM;
    }
}










