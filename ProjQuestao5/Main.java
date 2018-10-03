import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double n1,n2,n3,result;
        
        System.out.print("Digite o 1° número: ");
        n1 = leia.nextDouble();
        System.out.print("Digite o 2° número: ");
        n2 = leia.nextDouble();
        System.out.print("Digite o 3° número: ");
        n3 = leia.nextDouble();
        
        result = (n1+n2)*(n2+n3);
        System.out.print("\u000c");
        
        System.out.println("1° número: "+n1);
        System.out.println("2° número: "+n2);
        System.out.println("3° número: "+n3);
        System.out.println("Resultado da expressão: "+result);
    }
}