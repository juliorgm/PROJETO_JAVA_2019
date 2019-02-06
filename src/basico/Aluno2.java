package basico;

public class Aluno2 {

    public static void main(String[] args) {
        // total de aulas 5
        int frequencia = 100;
        double av1 = 9.5;
        double av2 = 9.8;
        double av3 = 8.9;
        double av4 = 10.0;
        double mediaFinal;

        mediaFinal = (av1 + av2 + av3 + av4)/ 4;

        System.out.println("Sua média final é de: " + mediaFinal + " e sua frequência é: "
                + frequencia + "%");
    }

}