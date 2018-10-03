
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Biblioteca objBiblioteca = new Biblioteca();

        ArrayList<Livro> lista = objBiblioteca.getListaDeLivros();

        System.out.print("Informe os dados da biblioteca\n"
                + "Nome: ");
        objBiblioteca.setNome(leia.next());

        System.out.print("CNPJ: ");
        objBiblioteca.setCnpj(leia.nextLong());

        byte op;

        do {
            System.out.print(":::::::::::::::::::LIVROS MANAGER:::::::::::::::::::\n"
                    + "1 - Cadastrar livro\n"
                    + "2 - Mostrar todos os livros\n"
                    + "3 - Mostrar a quantidade de livros\n"
                    + "4 - Mostrar dados da biblioteca\n"
                    + "5 - Excluir todos os livros\n"
                    + "0 - Sair\n"
                    + "Digite aqui a opção desejada: ");
            op = leia.nextByte();

            switch (op) {
                case 1:
                    Livro objLivro = new Livro();
                    System.out.print("Informe os dados do livro\n"
                            + "Título: ");
                    objLivro.setTitulo(leia.next());

                    System.out.print("Gênero: ");
                    objLivro.setGenero(leia.next());

                    System.out.print("Autor: ");
                    objLivro.setAutor(leia.next());

                    System.out.print("ISBN: ");
                    objLivro.setIsbn(leia.next());

                    lista.add(objLivro);

                    System.out.println("\nLivro cadastrado com sucesso!\n");

                    break;
                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("\nNão existem livros cadastrados!\n");
                    } else {
                        System.out.println("\nLista de Livros\n" + objBiblioteca.mostrarLivros());
                    }
                    break;
                case 3:
                    if (lista.isEmpty()) {
                        System.out.println("\nNão existem livros cadastrados!\n");
                    } else {
                        System.out.println("\nQuantidade de livros: " + lista.size() + "\n");
                    }
                    break;
                case 4:
                    System.out.println("\nDados da biblioteca" + objBiblioteca);
                    break;
                case 5:

                    if (lista.isEmpty()) {
                        System.out.println("\nNão existem livros a serem excluídos!\n");
                    } else {
                        do {
                            System.out.print(":::::::::::EXCLUSÃO::::::::::\n"
                                    + "Deseja realmente excluir todos os livros?\n"
                                    + "1 - Sim\n"
                                    + "2 - Não\n"
                                    + "Digite aqui a opção desejada: ");
                            op = leia.nextByte();

                            switch (op) {
                                case 1:
                                    lista.clear();
                                    System.out.println("\nLivros excluídos com sucesso!\n");
                                    break;
                                case 2:
                                    System.out.println("\nExclusão cancelada!\n");
                                    break;
                                default:
                                    System.out.println("\nOpção inválida\n"
                                            + "Digite novamente!\n");
                            }
                        } while (op < 1 || op > 2);

                    }

                    break;
                case 0:
                    System.out.println("\nSistema encerrado!\n");
                    break;
                default:
                    System.out.println("\nOpção inválida\n"
                            + "Digite novamente!\n");
            }

        } while (op != 0);

    }

}
