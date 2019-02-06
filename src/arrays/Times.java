package arrays;

import java.util.Scanner;

public class Times {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String times[] = new String[3];

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Informe o nome de um time");
            times[i] = scanner.nextLine();
        }

        System.out.println(times[0]);
        System.out.println(times[1]);
        System.out.println(times[2]);
    }
}
