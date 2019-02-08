package funcionarios;

public class Diretor extends Funcionario {
    private static final double VALOR_MINIMO_BONIFICACAO = 0.125;

    public Diretor(String nomeFuncionario, String rgFuncionario, String departamento, String dataEntrada, double salario) {
        super(nomeFuncionario, rgFuncionario, departamento, dataEntrada, salario);
    }

    @Override
    public double recebeBonificacao() {
        return super.calculaGanhoAnual()*VALOR_MINIMO_BONIFICACAO;
    }
}
