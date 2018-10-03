
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Biblioteca objBiblioteca = new Biblioteca();
        
        
        System.out.print("Informe os dados da biblioteca\n"
                + "Nome: ");
        objBiblioteca.setNome(leia.next());
        
        System.out.print("CNPJ: ");
        objBiblioteca.setCnpj(leia.nextLong());
        
        System.out.print("\nInforme os dados do livro 1\n"
                + "Título: ");
        objBiblioteca.getObjLivro1().setTitulo(leia.next());
        
        System.out.print("Gênero: ");
        objBiblioteca.getObjLivro1().setGenero(leia.next());
        
        System.out.print("Autor: ");  
        objBiblioteca.getObjLivro1().setAutor(leia.next());
        
        System.out.print("ISBN: ");
        objBiblioteca.getObjLivro1().setIsbn(leia.next());
        
        
        System.out.print("\nInforme os dados do livro 2\n"
                + "Título: ");
        objBiblioteca.getObjLivro2().setTitulo(leia.next());
        
        System.out.print("Gênero: ");
        objBiblioteca.getObjLivro2().setGenero(leia.next());
        
        System.out.print("Autor: ");  
        objBiblioteca.getObjLivro2().setAutor(leia.next());
        
        System.out.print("ISBN: ");
        objBiblioteca.getObjLivro2().setIsbn(leia.next());
        
        
        System.out.println("\nDados da biblioteca"+objBiblioteca);
        
    }
    
}
