
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n, m = 0;

        System.out.print("Digite o tamanho do array: ");
        int[] valores = new int[leia.nextInt()];

        System.out.print("Digite qual valor você quer contar: ");
        n = leia.nextInt();

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite " + (i + 1) + "° valor: ");
            valores[i] = leia.nextInt();

            if (valores[i] == n) {
                m++;
            }

        }
        System.out.print("A quantidade de vezes que o número " + n + " aparece é "+ m);

    }

}
