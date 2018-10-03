
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double[] valores = new double[10];
        String r = "";

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite " + (i + 1) + " valores: ");
            valores[i] = leia.nextDouble();

            r += valores[i] + " | ";
        }
        System.out.print(r);

    }

}
