import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int dia, mes, ano;
        
        String resp, bissexto;

        System.out.println("Digite a data: ");
        System.out.print("Dia: ");
        dia = leia.nextInt();
        System.out.print("Mês: ");
        mes = leia.nextInt();
        System.out.print("Ano: ");
        ano = leia.nextInt();
        System.out.print("\f");

        if((ano%4 == 0 && ano%100 != 0) || (ano%100 == 0 && ano%400 == 0)){
            bissexto = "O ano é bissexto";
        }else{
            bissexto = "O ano não é bissexto";
        }
        
        if(dia<1 || dia>31 || mes<1 || mes>12|| (mes==2 && !((ano%4 == 0 && ano%100 != 0) || (ano%100 == 0 && ano%400 == 0)) && dia>28) || mes==4 && dia>30 || mes==6 && dia>30 || mes==9 && dia>30 || mes==11 && dia>30){
            resp = "Dia inválido";
        }else{
            resp = "Dia válido";
        }
        
        
        /*
        *if(mes == 1){
        *    if(dia>0 && dia<31){
        *        resp = "Data válida";
        *    }else{
        *        resp = "Data inválida";
        *    }
        *}else if(mes == 2){
        *   if(bissexto == true && dia>0 && dia<30){
        *         resp = "Data válida";
        *     }else if(bissexto == false && dia>0 && dia<29){
        *        resp = "Data válida";
        *    }else{
        *        resp = "Data Inválida";
        *    }
        *}else if(mes == 3){
        *    
        *}
        */
       
        System.out.println("Data: "+dia+"/"+mes+"/"+ano);
        System.out.println(resp);
        System.out.println(bissexto);
    }
}