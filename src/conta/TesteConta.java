package conta;

public class TesteConta {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(123,1010,
                new Cliente("João","Farias","98765432178"),5500);

        ContaCorrente contaCorrente = new ContaCorrente(23423,1245,
                new Cliente("Vitor","Sardinha","96385274132"),5500);


        contaCorrente.saca(500);
        contaPoupanca.saca(500);

        contaCorrente.transferePara(1000,contaPoupanca);

        System.out.println(contaCorrente.getSaldo());
        System.out.println(contaPoupanca.getSaldo());
    }
}
