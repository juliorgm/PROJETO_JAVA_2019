package funcionarios;

import java.text.DecimalFormat;

public class Util {
    public static String formataDecimal(double numero){
        DecimalFormat format = new DecimalFormat("#0.00");
        return format.format(numero);
    }
}
