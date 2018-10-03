import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double n1,n2,media,freq;
        String nome, situacao;
        
        System.out.print("Digite o nome do aluno: ");
        nome = leia.next();
        System.out.println("Digite a nota das provas:");
        System.out.print("Prova 1: ");
        n1 = leia.nextDouble();
        System.out.print("Prova 2: ");
        n2 = leia.nextDouble();
        
        System.out.print("Digite a frequência: ");
        freq = leia.nextDouble();
        
        media = (n1+n2)/2;
        
        if(media>=6 && freq > 0.75){
            situacao = "Aluno aprovado";
        }else if(media < 6 && freq > 0.75){
            situacao = "Aluno aprovado por frequência e reprovado por média";
        }else if(media >= 6 && freq < 0.75){
            situacao = "Aluno aprovado por média e reprovado por frequência";
        }else{
            situacao = "Aluno reprovado";
        }
        
        System.out.print("\f");
        
        System.out.print("A situação do aluno "+nome+" é: \n"+situacao);
    }
}