import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double n1,n2,n3,arit,pond;
        
        System.out.print("Digite o 1° número: ");
        n1 = leia.nextDouble();
        System.out.print("Digite o 2° número: ");
        n2 = leia.nextDouble();
        System.out.print("Digite o 2° número: ");
        n3 = leia.nextDouble();
        
        arit = (n1+n2+n3)/3;
        pond = (n1*0.2)+(n2*0.4)+(n3*0.6);
        
        System.out.print("\u000c");
        
        System.out.println("1° nota: "+n1);
        System.out.println("2° nota: "+n2);
        System.out.println("3° nota: "+n3);
        System.out.println("Média aritmética: "+arit);
        System.out.println("Média ponderada: "+pond);
    }
}