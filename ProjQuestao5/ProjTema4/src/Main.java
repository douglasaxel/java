
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] valores = new int[5];
        String r = "", r2 = "";
        int n = 0, n2 = 0;

        for (int i = 0; i < 5; i++) {
            valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite " + (i + 1) + " valores: "));

            if (valores[i] % 2 == 0) {
                r += valores[i] + " | ";
                n++;
            } else {
                r2 += valores[i] + " | ";
                n2++;
            }

        }
        JOptionPane.showMessageDialog(null, "A quantidade de números pares é " + n + "\n"
                + "e eles são: " + r
                + "\n\nA quantidade de números ímpares é " + n2 + " \n"
                + "e eles são: " + r2);

    }

}
