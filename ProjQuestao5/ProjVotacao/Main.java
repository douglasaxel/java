import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        int chapa1 = 0;
        int chapa2 = 0;
        int chapa3 = 0;
        int votoRest = 100;
        int voto;
        String ganhador = null;
        
        Scanner leia = new Scanner(System.in);
        
        
        do{
            System.out.println("::::: ELEIÇÕES 2018 GRÊMIO ESTUDANTIL :::::");
            System.out.println("\t:: 1 - Chapa 1 ::");
            System.out.println("\t:: 2 - Chapa 2 ::");
            System.out.println("\t:: 3 - Chapa 3 ::");
            System.out.println("\tVotos restantes: "+votoRest);
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::");
            System.out.print("Informe seu voto: ");
            voto = leia.nextInt();   
            
            System.out.print("\f");
            
            switch(voto){
                case 1:
                    chapa1++;
                    votoRest--;
                    break;
                case 2:
                    chapa2++;
                    votoRest--;
                    break;
                case 3:
                    chapa3++;
                    votoRest--;
                    break;
                default:
                    System.out.println("ERRO: Opção inválida, tente novamente!");
            }
        }while(votoRest != 0 && chapa1 <= 50 && chapa2 <= 50 && chapa3 <= 50); 
        
        if(chapa1 > chapa2 && chapa1 > chapa3){
            ganhador = "O ganhador foi o estudante de chapa 1";
        }else if(chapa2 > chapa1 && chapa2 > chapa3){
            ganhador = "O ganhador foi o estudante de chapa 2";
        }else if(chapa3 > chapa2 && chapa3 > chapa1){
            ganhador = "O ganhador foi o estudante de chapa 3";
        }else if(chapa1 == chapa2){
            do{
                System.out.println("::::: ELEIÇÕES 2018 GRÊMIO ESTUDANTIL :::::");
                System.out.println("\t:: 1 - Chapa 1 ::");
                System.out.println("\t:: 2 - Chapa 2 ::");
                System.out.println("\tVotos restantes: "+votoRest);
                System.out.println(":::::::::::::::::::::::::::::::::::::::::::");
                System.out.print("Informe seu voto: ");
                voto = leia.nextInt();   
                
                System.out.print("\f");
                
                switch(voto){
                    case 1:
                        chapa1++;
                        break;
                    case 2:
                        chapa2++;
                        break;
                    default:
                        System.out.println("ERRO: Opção inválida, tente novamente!");
                }
            }while(votoRest != 0 && chapa1 <= 50 && chapa2 <= 50); 
            
            if(chapa1 > chapa2){
                ganhador = "O ganhador foi o estudante de chapa 1";
            }else{
                ganhador = "O ganhador foi o estudante de chapa 2";
            }
            
        }else if(chapa1 == chapa3){
            do{
                System.out.println("::::: ELEIÇÕES 2018 GRÊMIO ESTUDANTIL :::::");
                System.out.println("\t:: 1 - Chapa 1 ::");
                System.out.println("\t:: 3 - Chapa 3 ::");
                System.out.println("\tVotos restantes: "+votoRest);
                System.out.println(":::::::::::::::::::::::::::::::::::::::::::");
                System.out.print("Informe seu voto: ");
                voto = leia.nextInt();   
                
                System.out.print("\f");
                
                switch(voto){
                    case 1:
                        chapa1++;
                        break;
                    case 3:
                        chapa2++;
                        break;
                    default:
                        System.out.println("ERRO: Opção inválida, tente novamente!");
                }
            }while(votoRest != 0 && chapa1 <= 50 && chapa3 <= 50); 
            
            if(chapa1 > chapa3){
                ganhador = "O ganhador foi o estudante de chapa 1";
            }else{
                ganhador = "O ganhador foi o estudante de chapa 3";
            }
            
            }else{
            do{
                System.out.println("::::: ELEIÇÕES 2018 GRÊMIO ESTUDANTIL :::::");
                System.out.println("\t:: 2 - Chapa 2 ::");
                System.out.println("\t:: 3 - Chapa 3 ::");
                System.out.println("\tVotos restantes: "+votoRest);
                System.out.println(":::::::::::::::::::::::::::::::::::::::::::");
                System.out.print("Informe seu voto: ");
                voto = leia.nextInt();   
                
                System.out.print("\f");
                
                switch(voto){
                    case 2:
                        chapa1++;
                        break;
                    case 3:
                        chapa2++;
                        break;
                    default:
                        System.out.println("ERRO: Opção inválida, tente novamente!");
                }
            }while(votoRest != 0 && chapa2 <= 50 && chapa2 <= 50); 
            
            if(chapa2 > chapa3){
                ganhador = "O ganhador foi o estudante de chapa 2";
            }else{
                ganhador = "O ganhador foi o estudante de chapa 3";
            }
        }
        System.out.println(ganhador);
    }
}