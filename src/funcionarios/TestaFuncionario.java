package funcionarios;

public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(
                "José"
                ,"1234567"
                ,"Recursos Humanos"
                ,"02/02/2015"
                ,7000);

        f1.recebeAumento(200);

        double ganhoAnual = f1.calculaGanhoAnual();
        System.out.println(ganhoAnual);

        System.out.println(f1.toString());
    }
}
