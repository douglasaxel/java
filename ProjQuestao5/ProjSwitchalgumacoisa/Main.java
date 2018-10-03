import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int n;
        String resp;
        
        do{
            System.out.println("1 - Mostrar Salário Bruto");
            System.out.println("2 - Mostrar Valor de horas extras");
            System.out.println("3  - Mostrar Valor do VT");
            System.out.println("4 - Mostrar Valor do INSS");
            System.out.println("5 - Mostrar Valor da Insalubridade");
            System.out.println("6 - Mostrar Valor  do Salário Família");
            System.out.println("7 - Mostrar Valor do plano de carreira");
            System.out.println("8 - Mostrar Valor  total de plano de saúde");
            System.out.println("9 - Mostrar Valor do Salário Líquido");
            System.out.println("10 - Cadastrar novo funcionário");
            System.out.println("11 - Sair do sistema");
            System.out.println("Digite aqui a opção desejada: ");
            n = leia.nextInt();
            System.out.print("\f");


            switch(n){
                case 1:
                    resp = "O salário é: R$ 1000";
                    break;
                case 2:
                    resp = "O valor hora é R$: 10";
                    break;
                case 3:
                    resp = "O valor do vale transporte é: R$ 60";
                    break;
                case 4:
                    resp = "O valor do INSS é: R$ 110";
                    break;
                case 5:
                    resp = "O valor da Insalubridade é: R$ 400";
                    break;
                case 6:
                    resp = "O valor do Salário Família é: $ 350";
                    break;
                case 7:
                    resp = "O valor do Plano de carreira é: R$ 500";
                    break;
                case 8:
                    resp = "O valor do Plano de saúde é: R$ 600";
                    break;
                case 9:
                    resp = "O valor do Salário Líquido é: R$ 800";
                    break;
                case 10:
                    resp = "Funcionário cadastrado";
                    break;
                case 11:
                    resp = "Sistema encerrado";
                    break;
                default:
                    resp = "Opção inválida";
            }
            

            System.out.println(":::::::::::::::::::::::::::::::::::::::::::");
            System.out.println(resp);
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::");


        }while(n != 11);
    }
}