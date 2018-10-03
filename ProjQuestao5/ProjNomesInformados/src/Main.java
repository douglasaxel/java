
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String r = "";

        System.out.print("Informe a quantidade de nomes a ser digitado: ");
        String[] nomes = new String[leia.nextInt()];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print((i + 1) + "° nome: ");
            nomes[i] = leia.next();
            r += (i + 1) + "° nome: " + nomes[i] + "\n";
        }

        r += "\nResposta inversa\n";
        
        byte cont = 0;
        for (int j = nomes.length - 1; j >= 0; j--) {
            cont++;
            r += cont + "º nome: " + nomes[j] + "\n";
        }

        System.out.println(nomes.length + " nomes digitados\n\n"
                + "Nomes ordenados: \n" + r);

    }

}
