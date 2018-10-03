import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        double vD, sD;
        int mes = 0;
        
        System.out.print("Informe o valor do depósito: ");
        vD = leia.nextDouble();
        System.out.print("Informe o saldo que deseja atingir: ");
        sD = leia.nextDouble();
        
        do{
        
            vD = vD * 1.006;
            mes++;
         
        }while(vD < sD);
        
        System.out.println("\n\nValor depositado: "+vD+"\nSaldo desejado: "+sD+"\nMeses necessários para atingir: "+mes);
    }
}