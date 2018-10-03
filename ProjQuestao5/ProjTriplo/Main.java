import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int n1,triplo;
        
        System.out.print("Digite o 1° número: ");
        n1 = leia.nextInt();
        
        triplo = n1*3;
        System.out.print("\u000c");
        
        System.out.println("Número: "+n1);
        System.out.println("Triplo do n°: "+triplo);
    }
}