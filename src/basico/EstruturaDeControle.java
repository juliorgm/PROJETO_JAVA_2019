package basico;

import java.util.Scanner;

public class EstruturaDeControle {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Infome a idade");
        int idade = leitor.nextInt();


//        if (idade > 15) {
//            System.out.println("Pode votar!");
//        }
//
//        if (idade > 15)
//            System.out.println("Pode votar!");
//
//        if (idade > 15) {
//            System.out.println("Pode votar!");
//        }else{
//            System.out.println("Não pode votar ainda!");
//        }

        if (idade < 16) {
            System.out.println("Ainda não pode votar!");
        } else if (idade >= 18 && idade < 70) {
            System.out.println("Voto obrigatório");
        } else {
            System.out.println("Voto facultativo");
        }
    }
}
