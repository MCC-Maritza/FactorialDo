package factorialdo;
import java.util.Scanner;

/**
 *
 * @author maryse
 * 
 * do-while
 * Escribir un programa que visualice el factorial de un entero comprendido entre 2 y 20
 * En el programa se escribe un bucle do-while para validar la entrada de n, entre 
 * 2 y 20, y otro bucle for para calcular el factorial; como ejemplo, éste se diseña con 
 * una sentencia vacía, en la expresión de incremento se calculan los n productos con el 
 * operador *= junto al de decremento (--).
 * 
 */

public class FactorialDo {

    public static void main(String[] args) {
        int n, m, fact;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("\nFactorial de número n, entre 2 y 20: ");
            n = entrada.nextInt();
        } while ((n < 2) || (n > 20));
        for (m = n, fact = 1; n > 1; fact *= n--);
        System.out.println(m + "! = " + fact);
    }
}
