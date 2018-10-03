import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        
        System.out.print("Digite o valor de A: ");
        a = leia.nextInt();
        System.out.print("Digite o valor de B: ");
        b = leia.nextInt();
        System.out.print("Digite o valor de C: ");
        c = leia.nextInt();
        
        d = a;
        a = b;
        b = c;
        c = d;
        
        System.out.println("Valor de a: "+a);
        System.out.println("Valor de b: "+b);
        System.out.println("Valor de c: "+c);
    }
}

