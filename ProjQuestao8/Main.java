import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double n1,n2,n3,n4,n5,soma,vezes,media;
        
        System.out.print("Digite o 1° número: ");
        n1 = leia.nextDouble();
        System.out.print("Digite o 2° número: ");
        n2 = leia.nextDouble();
        System.out.print("Digite o 3° número: ");
        n3 = leia.nextDouble();
        System.out.print("Digite o 4° número: ");
        n4 = leia.nextDouble();
        System.out.print("Digite o 5° número: ");
        n5 = leia.nextDouble();

        
        soma = n1+n2+n3+n4+n5;
        vezes = n1*n2*n3*n4*n5;
        media = (n1+n2+n3+n4+n5)/5;
        System.out.print("\u000c");
        
        System.out.println("1° número: "+n1);
        System.out.println("2° número: "+n2);
        System.out.println("3° número: "+n3);
        System.out.println("4° número: "+n4);
        System.out.println("5° número: "+n5);
        System.out.println("Resultado da soma: "+soma);
        System.out.println("O produto dos n°: "+vezes);
        System.out.println("A média dos números: "+media);
    }
}