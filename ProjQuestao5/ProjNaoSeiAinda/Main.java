import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        String nome;
        double valorTotalPassagem = 0;
        double valorHora;
        double valorTotalTrabalhado;
        double salarioBruto;
        double valeTransporte = 0;
        double salarioRegional = 1103.66;
        double insalub = 0;
        double valorINSS = 0;
        double salarioLiquido;
        int op;

        Scanner leia = new Scanner(System.in);
        System.out.println("::: INFORME OS DADOS DO FUNCIONÁRIO :::");
        System.out.print("Nome: ");
        nome = leia.next();

        System.out.print("Valor hora: ");
        valorHora = leia.nextDouble();
        System.out.print("Valor total trabalhado: ");
        valorTotalTrabalhado = leia.nextDouble();

        salarioBruto = valorHora * valorTotalTrabalhado;
        
        do{
            System.out.println("::: VOCÊ RECEBE VALE TRANSPORTE? :::");
            System.out.println("1 - Sim\n2 - Não");
            System.out.print("Informe a opção: ");
            op = leia.nextInt();

            switch(op){
                case 1:
                    System.out.print("Valor total da passagem: ");
                    valorTotalPassagem = leia.nextDouble();
                    valeTransporte = salarioBruto * 0.06;
                    if(valeTransporte > valorTotalPassagem)
                        valeTransporte = valorTotalPassagem;
                    break;
                case 2:
                    valeTransporte = 0;
                    break;
                default:
                    System.out.println("ERRO: Opção inválida, tente novamente!");
            }
        }while(op != 1 && op != 2);
        
        System.out.print("\f");
        
        System.out.println(":::::::::: OPÇÃO DE INSALUBRIDADE ::::::::::");
        System.out.println("1 - Mínimo\n2 - Médio\n3 - Máximo\n0 - Não recebe");
        System.out.print("Informe a opção: ");
        op = leia.nextInt();
        
        switch(op){
            case 1:
                insalub = salarioRegional * 1.1;
                break;
            case 2:
                insalub = salarioRegional * 1.2;
                break;
            case 3:
                insalub = salarioRegional * 1.4;
                break;
            case 0:
                insalub = 0;
            default:
                System.out.println("ERRO: Opção inválida, tente novamente!");
        }
        
        if(salarioBruto < 1659.39)
            valorINSS = salarioBruto * 0.08;
        else if(salarioBruto < 2765.67)
            valorINSS = salarioBruto * 0.09;
        else if(salarioBruto < 5531.32)
            valorINSS = salarioBruto * 0.11;
        else if(salarioBruto > 5531.31)
            valorINSS = 608.44;
        
        salarioLiquido = salarioBruto + insalub - valeTransporte - valorINSS;
        
        System.out.print("\f");
        System.out.println(":::::::::: INFORMAÇÕES DO FUNCIONÁRIO ::::::::::");
        System.out.println("1 - Mostrar todos os dados\n2 - Ver descontos\n3 - Ver benefícios\n4 - Ver salário líquido\n0 - Sair");
        System.out.print("Informe a opção: ");
        op = leia.nextInt();
        
        System.out.print("\f");
        
        do{
            switch(op){
                case 1:
                    System.out.println("Valor total da passagem: R$"+valorTotalPassagem);
                    System.out.println("Valor hora: R$"+valorHora);
                    System.out.println("Valor total trabalhado: "+valorTotalTrabalhado);
                    System.out.println("Valor salário bruto: R$"+salarioBruto);
                    System.out.println("Valor vale transporte: R$"+valeTransporte);
                    System.out.println("Valor insalubridade: R$"+insalub);
                    System.out.println("Valor INSS: R$"+valorINSS);
                    System.out.println("Valor salário líquido: R$"+salarioLiquido);
                    break;
                case 2:
                    System.out.println("Valor vale transporte: R$"+valeTransporte);
                    System.out.println("Valor INSS: R$"+valorINSS);
                    break;
                case 3:
                    System.out.println("Valor insalubridade: R$"+insalub);
                    break;
                case 4:
                    System.out.println("Valor salário líquido: R$"+salarioLiquido);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("ERRO: Opção inválida, tente novamente!");
                } 
        }while(op == 0);
    }
}