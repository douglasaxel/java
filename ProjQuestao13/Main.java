import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);
        
        double a,b,c,d;
        
        System.out.println("Insira os valores de A, B e C, respectivamente. ");
        System.out.print("Valor de A: ");
        a = leia.nextDouble();
        System.out.print("Valor de B: ");
        b = leia.nextDouble();
        System.out.print("Valor de C: ");
        c = leia.nextDouble();
        
        d = Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2);
        System.out.print("\u000c");
        
        System.out.println("Dados do cálculo: ");
        System.out.println("Valor de A: "+a);
        System.out.println("Valor de B: "+b);
        System.out.println("Valor de C: "+c);
        System.out.println("Resultado da expressão: "+d);
    }
}