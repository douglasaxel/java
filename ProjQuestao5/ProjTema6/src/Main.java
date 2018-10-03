
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = 0, m = -1;
        int o = 0;

        System.out.print("Digite o tamanho do array: ");
        int[] valores = new int[leia.nextInt()];

        for (int i = 0; i < valores.length; i++) {

            System.out.print("Digite " + (i + 1) + "° valor: ");
            valores[i] = leia.nextInt();
            m++;
            if (valores[i] > n) {
                n = valores[i];
                o = m;
            }
        }
        
        System.out.print("O maior valor do array é " + n + " e está na posição " + o);

    }

}
