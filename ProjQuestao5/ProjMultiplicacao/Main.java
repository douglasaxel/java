import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int n1,n2,vezes;
        Scanner cu = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        n1 = cu.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = cu.nextInt();
        
        vezes = n1*n2;
        System.out.print("\u000c");
        
        System.out.println("1° número: "+n1);
        System.out.println("2° número: "+n2);
        System.out.println("O produto dos números é: "+vezes);
        
    
    }

}