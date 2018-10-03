import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double valores[] = new double[30];
        double decimo = 0, ferias = 0, maior = 0;
        String nome;
        
        System.out.print("Digite o nome do funcionario: ");
        nome = leia.next();
        
        System.out.println("Digite o salario de cada mes");
        
        for(int i = 0; i < 12; i++){
            System.out.println((i+1)+"° mes: ");
            valores[i] = leia.nextDouble();
            decimo += valores[i];
            
            if(valores[i] > maior){
                maior = valores[i];
            }
        }
        
        decimo = decimo/12;
        ferias = decimo * 1.33;
        
        System.out.print("\f");
        System.out.println("Funcionario: "+nome);
        System.out.println("O valor do decimo é: "+decimo);
        System.out.println("O valor das ferias é: "+ferias);
        System.out.println("O salario com maior valor é: "+maior);
    }
}