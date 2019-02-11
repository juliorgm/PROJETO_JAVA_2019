package conta;

public class ContaCorrente extends Conta {

    private final double TAXA_SAQUE = 00.20;

    public ContaCorrente(int agencia, int numero, Cliente titular, double saldo) {
        super(agencia, numero, titular, saldo);
    }

    @Override
    public boolean saca(double valorSaque) {
        return super.saca(valorSaque + TAXA_SAQUE);
    }
}
