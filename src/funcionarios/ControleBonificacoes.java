package funcionarios;

public class ControleBonificacoes {
    private double totalBonificacoes;

    public void registraBonificacao(Funcionario funcionario){
        System.out.println("Aplicando bonificação para " + funcionario.getNome());
        this.totalBonificacoes+=funcionario.recebeBonificacao();
    }

    public double getTotalBonificacoes(){
        return this.totalBonificacoes;
    }
}
