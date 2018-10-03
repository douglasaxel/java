import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double f,c;
        
        System.out.print("Digite a temperatura em Celcius: ");
        c = leia.nextInt();
        
        f = (9 * c + 160)/5;
        System.out.print("\u000c");
        
        System.out.println("Temperatura em C: "+c);
        System.out.println("Temperatura em F: "+f);
    }
}
