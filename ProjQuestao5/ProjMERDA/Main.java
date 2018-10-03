import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        int [] valor = {10,5,6,7,3,5};
        int aux;
        boolean controle;
        
        
        
        for(int i = 0; i < valor.length; i++){
            controle = true;
            for(int j = 0;valor[j]>valor[j+1];j++){
                aux = valor[j];
                valor[j] = valor[j+1];
                aux = valor[j];
                controle = false;
            }
            if(controle){
                break;
            }
        }
        
        System.out.println();
    }
}