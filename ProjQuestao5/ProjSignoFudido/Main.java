import java.util.Scanner;
public class Main{
    public static void main(String[] args){
       Scanner leia = new Scanner(System.in);
       int idade, dia, mes, ano, diaA, mesA, anoA;
       String signo;
        
       System.out.println("Digite sua data de nascimento: ");
       System.out.print("Dia: ");
       dia = leia.nextInt();
       System.out.print("Mês: ");
       mes = leia.nextInt();
       System.out.print("Ano: ");
       ano = leia.nextInt();
       System.out.print("\f");
       System.out.println("Digite a data atual: ");
       System.out.print("Dia: ");
       diaA = leia.nextInt();
       System.out.print("Mês: ");
       mesA = leia.nextInt();
       System.out.print("Ano: ");
       anoA = leia.nextInt();
       System.out.print("\f");
        
       if(((mes >= 1 && mes <= 12 && dia >= 1 && dia <= 31 && ano >= 1) && ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) || (mes == 2 && (dia <= 29 && ano%4 == 0 && (ano%100 != 0 || ano%400 == 0)) || dia <= 28) ||((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30)))&&(((mesA >= 1 && mesA <= 12 && diaA >= 1 && diaA <= 31 && anoA >= 1) && ((mesA == 1 || mesA == 3 || mesA == 5 || mesA == 7 || mesA == 8 || mesA == 10 || mesA == 12) || (mesA == 2 && (diaA <= 29 && anoA%4 == 0 && (anoA%100 != 0 || anoA%400 == 0)) || diaA <= 28) ||((mesA == 4 || mesA == 6 || mesA == 9 || mesA == 11) && diaA <= 30))))){
       
           if(mes >= mesA && dia > diaA || mes > mesA){
                idade = anoA-ano-1;
           }else{
                idade = anoA-ano;
           }
            
           if (mes==1 &&  dia>20 && mes==2 && dia<19){
               signo = "aquário";
           }else if(mes==2 && dia>18 || mes==3 && dia<20){
               signo = "peixes";
           }else if(mes==3 && dia>19 || mes==4 && dia<21){
               signo = "áries";
           }else if(mes==4 && dia>20 || mes==5 && dia<21){
               signo = "touro";
           }else if(mes==5 && dia>20 || mes==6 && dia<21){
               signo = "gêmios";
           }else if(mes==6 && dia>20 || mes==7 && dia<22){
               signo = "cancêr";
           }else if(mes==7 && dia>21 || mes==8 && dia<23){
               signo = "leão";
           }else if(mes==8 && dia>22 || mes==9 && dia<23){
               signo = "virgem";
           }else if(mes==9 && dia>22 || mes==10 && dia<23){
               signo = "libra";
           }else if(mes==10 && dia>22 || mes==11 && dia<22){
               signo = "escorpião";
           }else if(mes==11 && dia>21 || mes==12 && dia<22){
               signo = "sagitário";
           }else if(mes==12 && dia>21 || mes==1 && dia<22){
               signo = "capricórnio";
           }else{
               signo = "NÃO ESXISTE";
           }
           
           System.out.println("Data de nascimento: "+dia+"/"+mes+"/"+ano);
           System.out.println("Data atual: "+diaA+"/"+mesA+"/"+anoA);
           System.out.println("Sua idade: "+idade);
           System.out.println("Seu signo: "+signo);
       }else{
            System.out.print("Data inválida");
       }
       
        
    }
}