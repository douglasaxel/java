import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);
        
        double a;
        double b;
        double c;
        double x1;
        double x2;
        
        System.out.println("Insira os valores de A, B e C, respectivamente. ");
        System.out.print("Valor de A: ");
        a = leia.nextDouble();
        System.out.print("Valor de B: ");
        b = leia.nextDouble();
        System.out.print("Valor de C: ");
        c = leia.nextDouble();
        x1 = (-b + Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
        x2 = (-b - Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
        System.out.print("\u000c");
        
        System.out.println("Dados do cálculo: ");
        System.out.println("Valor de A: "+a);
        System.out.println("Valor de B: "+b);
        System.out.println("Valor de C: "+c);
        System.out.println("Valor do X1: "+x1);
        System.out.println("Valor do X2: "+x2); 
    }
}