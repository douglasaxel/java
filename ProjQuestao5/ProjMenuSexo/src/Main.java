
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome, sexo = null;
        byte op;
        
        System.out.print("Informe os dados da pessoa\n"
                + "Nome: ");
        nome = leia.next();
        System.out.print("\f");
        
        do {
            System.out.println("Escolha o sexo conforme abaixo:\n"
                    + "1 - Masculino\n"
                    + "2 - Feminino\n"
                    + "Digite aqui a opção desejada: ");
            op = leia.nextByte();
            System.out.print("\f");
            
            switch (op) {
                case 1:
                    sexo = "Masculino";
                    break;
                case 2:
                    sexo = "Feminino";
                default:
                    System.err.print("\nOpção inválida\nDigite novamete\n");
            }
        } while (op != 1 && op != 2);
        
        System.out.print("\f");
        System.out.println("Dados da pessoa\n"
                + "Nome: "+nome+"\n"
                + "Sexo: "+sexo);
    }
    
}
