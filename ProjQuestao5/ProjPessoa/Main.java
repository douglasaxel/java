import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Pessoa objPessoa = new Pessoa();
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Informe os dados da pessoa\n"
            +"Nome: ");
        objPessoa.nome = leia.next();
        
        System.out.print("Idade: ");
        objPessoa.idade = leia.nextByte();
        
        System.out.print("Peso: ");
        objPessoa.peso = leia.nextDouble();
        
        System.out.print("Altura: ");
        objPessoa.altura = leia.nextFloat();
        
        System.out.print("Sexo: ");
        objPessoa.sexo = leia.next();
        
        System.out.print("CPF: ");
        objPessoa.cpf = leia.nextLong();
        System.out.print("\f");
        
        System.out.print("Dados da pessoa\n"
            +"Nome: "+objPessoa.nome+"\n"
            +"Idade: "+objPessoa.idade+"\n"
            +"Peso: "+objPessoa.peso+"\n"
            +"Altura: "+objPessoa.altura+"\n"
            +"Sexo: "+objPessoa.sexo+"\n"
            +"CPF: "+objPessoa.cpf);
    }
}