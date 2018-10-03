import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double emprestimo,amortizacao;
        
        System.out.print("Digite o 1° número: ");
        emprestimo = leia.nextDouble();
        
        amortizacao = (emprestimo*1.32)/12;
        System.out.print("\u000c");
        
        System.out.println("Valor do empréstimo: "+emprestimo);
        System.out.println("Valor da amortização: "+amortizacao);
    }
}
