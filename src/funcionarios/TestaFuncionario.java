package funcionarios;

public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(
                "José"
                , "1234567"
                , "Recursos Humanos"
                , "02/02/2015"
                , 7000);


        Gerente g1 = new Gerente("Maria", "13131"
                , "Gerente Desenvolvimento", "01/01/2000"
                , 10000, 25, 12345);

        //f1.recebeAumento(200);
        g1.autentica(12345);


        System.out.println("Gerente -" + g1.recebeBonificacao());
    }
}
