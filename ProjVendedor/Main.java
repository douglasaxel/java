import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double meta, totalV, comissao, valorTotal;
        String nome;
        
        System.out.print("Digite o nome do vendedor: ");
        nome = leia.next();
        System.out.println("Digite a meta: ");
        meta = leia.nextInt();
        System.out.println("Digite o total vendido: ");
        totalV = leia.nextInt();

        if(totalV < meta/2){
            comissao = totalV * 0.01;
            valorTotal = totalV + comissao;
        }else if(totalV >= meta/2 && totalV <= meta*0.75){
            comissao = totalV * 0.025;
            valorTotal = totalV + comissao;
        }else if(totalV > meta*0.75 && totalV <= meta){
            comissao = totalV * 0.035;
            valorTotal = totalV + comissao;
        }else{
            comissao = totalV * 0.05;
            valorTotal = totalV + comissao;
        }
        
        System.out.print("\f");
        
        System.out.println("O nome do vendedor é: "+nome);
        System.out.println("Meta: "+meta);
        System.out.println("Total de vendas: "+totalV);
        System.out.println("Comissao: "+comissao);
        System.out.println("O valor total a ganhar: "+valorTotal);
        
    }
}