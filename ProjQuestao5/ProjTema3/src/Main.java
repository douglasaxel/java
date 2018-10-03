
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] valores = new int[5];
        String r = "";
        int n = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite " + (i + 1) + " valores: ");
            valores[i] = leia.nextInt();

            if (valores[i] < 0) {
                r += valores[i] + " | ";
                n++;
            }

        }
        System.out.print("A quantidade de números negativos é " + n + "\n"
                + "e eles são: " + r);

    }

}
