package arrays;

import fabricaDeCarros.Motor;

import java.util.Scanner;

public class ArrayMotor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Motor motores[];
        System.out.println("Informe quantos moteres irá cadastrar");

        if (scanner.hasNextInt()) {
            motores = new Motor[scanner.nextInt()];

            for (int i = 0; i < motores.length; i++) {
                System.out.println("Informe a potêcia (número)");
                int potencia = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Informe o tipo Gasolina/Diesel");
                String tipo = scanner.nextLine();

                motores[i] = new Motor(potencia,tipo);
            }

            for (Motor motor:motores) {
                motor.imprirmirInformacoesMotor();
            }
        }
    }
}
