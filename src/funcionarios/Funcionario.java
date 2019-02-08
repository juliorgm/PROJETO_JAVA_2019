package funcionarios;

public class Funcionario {
    private static final double VALOR_MINIMO_AUMENTO = 0.01;
    private static final double VALOR_MINIMO_BONIFICACAO = 0.1;

    private String nomeFuncionario;
    private String rgFuncionario;
    private String departamento;
    private String dataEntrada;
    protected double salario;


    public Funcionario(String nomeFuncionario, String rgFuncionario, String departamento, String dataEntrada, double salario) {
        this.nomeFuncionario = nomeFuncionario;
        this.rgFuncionario = rgFuncionario;
        this.departamento = departamento;
        this.dataEntrada = dataEntrada;
        this.salario = salario;
    }


    public boolean recebeAumento(double valorDoAcrescimo) {
        if (valorDoAcrescimo >= VALOR_MINIMO_AUMENTO) {
            this.salario += valorDoAcrescimo;
            System.out.println("Aumento realizado com sucesso");
            return true;
        }
        System.out.println("Não é possível diminuir o valor do salario");
        return false;
    }

    public double calculaComissao(int comissao) {
        return comissao;
    }

    public double recebeBonificacao() {
        return this.calculaGanhoAnual()*VALOR_MINIMO_BONIFICACAO;
    }

    public double calculaGanhoAnual() {
        return this.salario * 12;
    }

    @Override
    public String toString() {
        return  "Nome: " + nomeFuncionario +
                "\nRG" + rgFuncionario +
                "\nDepartamento: " + departamento +
                "\nData de entrada: " + dataEntrada +
                "\nSalario: " + salario;
    }
}
