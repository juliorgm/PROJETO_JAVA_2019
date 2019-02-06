package fabricaDeCarros;

import java.util.Scanner;

public class TestaCarros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro pampa = new Carro("Azul claro"
                ,"Pampa - Clássico 1987"
                ,0
                ,200
                ,false
                , new Motor(99,"Gasolina"));

        pampa.ligarCarro();

        System.out.println("informe o valor a acelerar");

        if (scanner.hasNextDouble())
            pampa.acelerarCarro(scanner.nextDouble());
        else
            pampa.acelerarCarro(0);

        pampa.imprimirInformacoesVeiculo();
    }
}
