package fabricaDeCarros;

public class Carro {
    private String cor;
    private String modelo;
    private double velocidadeAtual;
    private double velocidadeMaxima;
    private boolean ligar = false;
    private Motor motor;

    public Carro(String cor, String modelo, double velocidadeAtual, double velocidadeMaxima, boolean ligar, Motor motor) {
        this.cor = cor;
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMaxima = velocidadeMaxima;
        this.ligar = ligar;
        this.motor = motor;
    }

    public void ligarCarro(){
        this.ligar = true;
    }

    public void desligarCarro(){
        this.ligar = false;
    }

    public boolean acelerarCarro(double velocidade){
        if (validarCarroLigado()) return false;

        double novaVelocidade = this.velocidadeAtual + velocidade;
        if (novaVelocidade > this.velocidadeMaxima) {
            System.out.println("A velocidade ultrapassa o limite máximo do veiculo");
            return false;
        }

        this.velocidadeAtual = novaVelocidade;
        return true;
    }

    private boolean validarCarroLigado() {
        if (this.ligar == false) {
            System.out.println("O Veiculo está desligado");
            return true;
        }
        return false;
    }

    public boolean desacelerarCarro(double velocidade){
        if (validarCarroLigado()) return false;

        this.velocidadeAtual -= velocidade;
        return true;
    }

    public int pegaMarcha(){
        if (this.velocidadeAtual < 0) return -1;
        else if (this.velocidadeAtual < 40) return 1;
        else if (this.velocidadeAtual < 80) return 2;
        else return 3;
    }

    public void imprimirInformacoesVeiculo(){
        System.out.println("================================");
        System.out.println("================================");
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Velocidade Atual: " + this.velocidadeAtual);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        this.motor.imprirmirInformacoesMotor();
        System.out.println("================================");
    }
}
