import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double precoL, kmL, distancia, gasto, qtdL;
        
        System.out.print("Digite o preço por L: ");
        precoL = leia.nextDouble();
        System.out.print("Quilometragem por litro: ");
        kmL = leia.nextDouble();
        System.out.print("Distância a viajar: ");
        distancia = leia.nextDouble();

        
        qtdL = distancia/kmL;
        gasto = qtdL*precoL;
        System.out.print("\u000c");
        
        System.out.println("Preço por L: "+precoL);
        System.out.println("KM/L: "+kmL);
        System.out.println("Distância: "+distancia);
        System.out.println("Litros necessários: "+qtdL);
        System.out.println("Gasto: "+gasto);
    }
}