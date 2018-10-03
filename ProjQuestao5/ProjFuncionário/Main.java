import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        String nome = "Jõao Kléber";
        int chapa = 123;
        double valorHora = 35.5;
        double horasTrab = 150.13;
        double salario; 
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Informe os dados do funcionário");
        System.out.print("Nome: ");
        nome = leia.next();
        System.out.print("Chapa: ");
        chapa = leia.nextInt();
        System.out.print("Ganhos por hora: ");
        valorHora = leia.nextDouble();
        System.out.print("Horas trabalhadas: ");
        horasTrab = leia.nextDouble();        
        
        salario = valorHora*horasTrab;
        System.out.print("\u000c");
         
        System.out.println("Dados do funcionário");
        System.out.println("Nome: "+nome);
        System.out.println("Chapa: "+chapa);
        System.out.println("Ganhos por hora: "+valorHora);
        System.out.println("Horas trabalhadas: "+horasTrab);   
        System.out.println("Salário: "+salario);
    
    }
}
