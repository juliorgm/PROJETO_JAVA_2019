package conta;

public class Conta {
    private int agencia;
    private int numero;
    private Cliente titular;
    private double saldo;
    private static int totalDeContas;

    public Conta(int agencia, int numero, Cliente titular, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        Conta.totalDeContas++;
    }

    public boolean saca(double valorSaque){
        if (valorSaque <= this.saldo) {
            this.saldo -= valorSaque;
            return true;
        }
        System.out.println("Você não possui saldo!");
        return false;
    }

    public void deposito(double valorDeposito){
        this.saldo += valorDeposito;
    }

    public boolean transferePara(double valor, Conta conta){
        if (this.saca(valor)) {// Conta do emissor
            conta.deposito(valor); // Conta do destinatario
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public static int getTotalDeContas(){
        return Conta.totalDeContas;
    }
}
