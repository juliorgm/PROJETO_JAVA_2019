package fabricaDeCarros;

public class Motor {
    int potencia;
    String tipo;

    public Motor(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public void imprirmirInformacoesMotor(){
        System.out.println("--------------------------------");
        System.out.println("Potência: " + this.potencia);
        System.out.println("Tipo: " + this.tipo);
    }
}
