import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int sexo;
        double peso,altura;
        String erro = "";
        
        System.out.print("Altura: ");
        altura = leia.nextDouble();
        System.out.print("Sexo (1 = fem / 2 = masc): ");
        sexo = leia.nextInt();
        
        
        if(sexo==2){
            peso = (72.7 * altura) - 58;
        }else if(sexo==1){
            peso = (62.1 *altura) - 44.7;
        }else{
            erro = "SÓ PODE DIGITA 1 OU 2 O IMUNDICIA!!!!";
            peso = 0;
        }
        System.out.println("O seu peso ideal é: "+peso+" "+ erro);
    }
}