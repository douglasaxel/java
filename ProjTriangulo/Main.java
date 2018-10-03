import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double lado1,lado2,lado3,ang1,ang2,ang3;
        boolean validacao;
        String tipoLado = "",tipoAng = "";
        
        do{
            System.out.println("Digite as seguintes informações de um triangulo");
            System.out.print("Lado 1: ");
            lado1 = leia.nextDouble();
            System.out.print("Lado 2: ");
            lado2 = leia.nextDouble();
            System.out.print("Lado 3: ");
            lado3 = leia.nextDouble();
            System.out.print("Ângulo 1: ");
            ang1 = leia.nextDouble();
            System.out.print("Ângulo 2: ");
            ang2 = leia.nextDouble();
            System.out.print("Ângulo 3: ");
            ang3 = leia.nextDouble();
            System.out.println("\f");
            
            validacao= (lado1 > 0 && lado2 > 0 && lado3 > 0) && (lado1 < lado2+lado3 || lado2 < lado1+lado3 || lado3 < lado1+lado2) && (ang1 > 0 && ang2 > 0 && ang3 > 0) && (ang1+ang2+ang3 == 180);
            
            if(validacao == true){
                if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                    tipoLado = "Triângulo retângulo";
                }else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
                    tipoLado = "Triângulo escaleno";
                }else{
                    tipoLado = "Triângulo isósceles";
                }
                
                if(ang1 > 90 || ang2 > 90 || ang3 > 90){
                    tipoAng = "Triângulo obtusângulo";
                }else if(ang1 < 90 && ang2 < 90 && ang3 < 90){
                    tipoAng = "Trinângulo acutângulo";
                }else{
                    tipoAng = "Triângulo retângulo";
                }
            }else{
                System.out.println("O triângulo é invalido!");
            }
        }while(validacao == false);
        
        System.out.println("\f");
        
        System.out.println("Lado 1: "+lado1);
        System.out.println("Lado 2: "+lado2);
        System.out.println("Lado 3: "+lado3);
        System.out.println("Ângulo 1: "+ang1);
        System.out.println("Ângulo 2: "+ang2);
        System.out.println("Ângulo 3: "+ang3);
        System.out.println(tipoLado);
        System.out.print(tipoAng);
    }
}