import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        double tVL;
        double tV;
        double l350;
        double l600;
        double l2;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Dê as informações pedidas: ");
        System.out.print("Total de latas de 350 ml vendidas: ");
        l350 = leia.nextDouble();
        System.out.print("Total de latas de 600 ml vendidas: ");
        l600 = leia.nextDouble();
        System.out.print("Total de garrafas de dois litros vendidas: ");
        l2 = leia.nextDouble();
        
        tVL = (l350*0.350) + (l600*0.600) + (l2*2);
        tV = (l350*1.20) + (l600*1.80) + (l2*2.80);
        
        System.out.println("\u000c");
        
        System.out.println("Total de vendas do mês: ");
        System.out.println("Número de latas de 350ml vendidas: "+l350);
        System.out.println("Número de latas de 600ml vendidas: "+l600);
        System.out.println("Número de garrafas de 2 L vendidas: "+l2);
        System.out.println("Total de litros vendidos no mês: "+tVL);
        System.out.println("Total de dinheiro ganho este mês: "+tV+" reais");
    }
}