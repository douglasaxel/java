import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int valor[] = new int[10];
        String r = "";
        int n=0;
        
        for(int i = 0; i < 10; i++){
            System.out.println("Digite o "+(i+1)+"° número: ");
            valor[i] = leia.nextInt();
            r = "\n"+(i+1)+"° número é: "+valor[i];
            
            if(valor[i] > n){
               n = valor[i];
               
            }
        }
        System.out.print("\f");
        
        System.out.print("");
    }
}