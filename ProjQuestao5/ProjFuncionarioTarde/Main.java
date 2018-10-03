import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        String nome;
        double valorP;
        double valorH;
        double cargaH;
        double salarioB;
        double valorVT=0;
        double insa=0;
        double inss;
        double salarioL;
        byte op;
        
        System.out.print("Informe os dados do funcionário\n"
            +"Nome: ");
        nome = leia.next();
        
        System.out.print("Valor hora: ");
        valorH = leia.nextDouble();
        
        System.out.print("Carga horaria: ");
        cargaH = leia.nextDouble();
        
        System.out.print("\f");
        
        salarioB = valorH*cargaH;
        
        do{
            System.out.print("Escolha a opção do VT\n"
                +"1 - Sim, recebe VT\n"
                +"2 - Não, não recebe VT\n"
                +"Digite aqui a opção desejada: ");
            op = leia.nextByte();
            
            System.out.print("\f");
            
            switch(op){
                case 1:
                    System.out.print("Informe o valor total pago em passagens: ");
                    valorP = leia.nextDouble();
                    
                    valorVT = salarioB * 0.06;
                    
                    if(valorVT > valorP){
                        valorVT = valorP;
                    }
                    break;
                case 2:
                    valorVT = 0;
                    break;
                default:
                    System.out.println("\nOpção inválida\nDigite novamente\n");
            }
            
        }while(op != 1 && op != 2);
        
        do{
            System.out.print("Escolha a opção da Insalubridade\n"
                +"1 - Mínima\n"
                +"2 - Média\n"
                +"3 - Máxima\n"
                +"0 - Não recebe\n"
                +"Digite aqui a opção desejada: ");
            op = leia.nextByte();
            
            System.out.print("\f");
            
            switch(op){
                case 1:
                    insa = 110.37;
                    break;
                case 2:
                    insa = 220.73;
                    break;
                case 3:
                    insa = 441.46;
                    break;
                case 0:
                    insa = 0;
                    break;
                default:
                    System.out.println("\nOpção inválida\nDigite novamente\n");
            }
            
        }while(op < 0 || op > 3);
        
        if(salarioB <= 1659.38){
            inss = salarioB * 0.08;
        }else if(salarioB <= 2765.66){
            inss = salarioB * 0.09;
        }else if(salarioB <= 5531.31){
            inss = salarioB * 0.11;
        }else{
            inss = 608.44;
        }
        
        salarioL = salarioB - valorVT - inss + insa;
        
        do{
             System.out.print(":::::::::::::::::::::::Informações do funcionário:::::::::::::::::::::::\n"
                +"Escolha uma opção abaixo:\n"
                +"1-Mostrar todos os dados do funcionário\n"
                +"2-Ver descontos\n"
                +"3-Ver benefícios\n"
                +"4-Ver Salário Líquido\n"
                +"0-Sair\n"
                +"Digite aqui a opção desejada: ");
                
            op = leia.nextByte();
            
            System.out.print("\f");
            
            switch(op){
                case 1:
                    System.out.print("Dados dod funcionário\n"
                        +"");
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 0:
                    System.out.print("Saindo...");
                    break;
                default:
                    System.out.println("\nOpção inválida\nDigite novamente\n");
            }
        }while(op != 0);
        
    }
}