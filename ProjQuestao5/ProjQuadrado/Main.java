import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int n1;
        double quad;
        
        System.out.print("Digite um número: ");
        n1 = leia.nextInt();
        
        quad = Math.pow(n1,2);
        System.out.print("\u000c");
        
        System.out.println("Número digitado: "+n1);
        System.out.println("Quadrado do número: "+quad);
    }
}