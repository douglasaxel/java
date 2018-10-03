import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int a,b,c,o;
        
        System.out.print("Digite o valor de A: ");
        a = leia.nextInt();
        System.out.print("Digite o valor de B: ");
        b = leia.nextInt();
        System.out.print("Digite o valor de C: ");
        c = leia.nextInt();

        a = b;
        b = c;
        c = o;
        o = a;
        
        System.out.print("\u000c");
        
        
        System.out.println("A : "+a);
        System.out.println("B : "+b);
        System.out.println("C : "+c);
    }
}