import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int idade;
        String nome, classificacao;
        
        System.out.print("Digite o nome do nadador: ");
        nome = leia.next();
        System.out.println("Digite a idade: ");
        idade = leia.nextInt();

        if(idade >= 50 && idade <= 60){
            classificacao = "Terceira idade";
        }else if(idade >= 8 && idade <= 10){
            classificacao = "Infantil";
        }else if(idade >= 11 && idade <= 17){
            classificacao = "Juvenil";
        }else if(idade >= 18 && idade <= 49){
            classificacao = "Adulto";
        }else{
            classificacao = "não pode ser nadador, mínimo 8 anos e no máximo 60";
        }
        
        System.out.print("\f");
        
        System.out.print("O nome do nadador é: "+nome+"\nClassificação: "+classificacao);
    }
}