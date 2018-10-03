
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe os dados da biblioteca\n"
                + "Nome: ");
        String nome = leia.next();

        System.out.print("CNPJ: ");
        long cnpj = leia.nextLong();

        System.out.print("Informe a quantidade de livros que deseja cadastrar: ");
        Biblioteca objBiblioteca = new Biblioteca(leia.nextInt());

        objBiblioteca.setNome(nome);
        objBiblioteca.setCnpj(cnpj);

        for (int i = 0; i < objBiblioteca.getListaDeLivros().length; i++) {
            System.out.print("\nInforme os dados do livro "+(i+1)+"\n"
                    + "Título: ");
            objBiblioteca.getListaDeLivros()[i].setTitulo(leia.next());
                    
            
            System.out.print("Gênero: ");
            objBiblioteca.getListaDeLivros()[i].setGenero(leia.next());

            System.out.print("Autor: ");
            objBiblioteca.getListaDeLivros()[i].setAutor(leia.next());

            System.out.print("ISBN: ");
            objBiblioteca.getListaDeLivros()[i].setIsbn(leia.next());

        }
        System.out.println("\nDados da biblioteca" + objBiblioteca);

    }

}
