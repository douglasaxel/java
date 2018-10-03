import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int mes;
        String aham;
        
        System.out.print("Digite um número de 1 a 12: ");
        do{
           
            mes = leia.nextInt();

            if(mes < 1 || mes > 12){
                System.out.print("Número é "+mes+" e este número é Inválido\nDigite novamente: ");
            }else{
                
            }
  
        }while(mes <1 || mes > 12);
        
        System.out.print("\f");
        
        if (mes == 1){
            aham = "Janeiro";
        }else if(mes == 2){
            aham = "Fevereiro";
        }else if(mes == 3){
            aham = "Março";
        }else if(mes == 4){
            aham = "Abril";
        }else if(mes == 5){
            aham = "Maio";
        }else if(mes == 6){
            aham = "Junho";
        }else if(mes == 7){
            aham = "Julho";
        }else if(mes == 8){
            aham = "Agosto";
        }else if(mes == 9){
            aham = "Setembro";
        }else if(mes == 10){
            aham = "Outubro";
        }else if(mes == 11){
            aham = "Novembro";
        }else{
            aham = "Dezembro";
        }
        System.out.println("O número é: "+mes+" e o mês é "+aham);

    }
}