package basico;

import java.text.DecimalFormat;

public class Area {
    public static void main(String[] args) {
        double x = 3/5.0;
        System.out.println(x);
    }

    public static String formataNumero(double numero){
        DecimalFormat format = new DecimalFormat();
        DecimalFormat df = new DecimalFormat("#0.00");
        return df.format(numero);
    }
}
