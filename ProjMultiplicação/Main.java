import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int n1,n2,vezes;
        
        System.out.print("Digite o 1° número: ");
        n1 = leia.nextInt();
        System.out.print("Digite o 2° número: ");
        n2 = leia.nextInt();
        
        vezes = n1*n2;
        System.out.print("\u000c");
        
        System.out.println("1° número: "+n1);
        System.out.println("2° número: "+n2);
        System.out.println("O produto dos números: "+vezes);
    }
}