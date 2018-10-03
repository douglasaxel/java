import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
     
        double media = 0, maior = 0;
        System.out.print("digite o tanto de puto");
        double valores[] = new double[30];
        
        
        for(int i = 0; i < 30; i++){
            System.out.println("Digite a nota media do "+(i+1)+"° aluno: ");
            valores[i] = leia.nextDouble();
            media += valores[i];
            if(valores[i] > maior){
                maior = valores[i];
            }
        }
        
        media = media/30;
        
        System.out.print("A média da sala é: ");
        System.out.print("A média da sala é: "+media);
        System.out.print("A maior média da sala é: "+maior);
    }
}