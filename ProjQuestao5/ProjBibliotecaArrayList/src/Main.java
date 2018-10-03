
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Biblioteca objBiblioteca = new Biblioteca();

        objBiblioteca.setNome(JOptionPane.showInputDialog("Informe os dados da biblioteca\n"
                + "Nome:"));
        objBiblioteca.setCnpj(Long.parseLong(JOptionPane.showInputDialog("Informe os dados da biblioteca\n"
                + "CNPJ:")));

        byte op;

        do {
            op = Byte.parseByte(JOptionPane.showInputDialog("::::::::::::BIBLIOTECA:::::::::::::::\n"
                    + "1 - Cadastrar livro\n"
                    + "2 - Mostrar os livros\n"
                    + "3 - Mostrar a quantidade de livros\n"
                    + "4 - Mostrar dados da biblioteca\n"
                    + "5 - Excluir todos os livros\n"
                    + "0 - Sair"));

            switch (op) {
                case 1:
                    Livro objLivro = new Livro();
                    objLivro.setTitulo(JOptionPane.showInputDialog("Informe os dados do livro\n"
                            + "Título: "));
                    objLivro.setGenero(JOptionPane.showInputDialog("Informe os dados do livro\n"
                            + "Gênero: "));
                    objLivro.setAutor(JOptionPane.showInputDialog("Informe os dados do livro\n"
                            + "Autor: "));
                    objLivro.setIsbn(JOptionPane.showInputDialog("Informe os dados do livro\n"
                            + "ISBN: "));
                    objBiblioteca.getListaDeLivros().add(objLivro);
                    JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso.");
                    break;
                case 2:
                    if (objBiblioteca.getListaDeLivros().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não existem livros cadastrados.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Lista de livros\n\n"
                                + objBiblioteca.mostrarLivros());
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Quantidade de livros: " + objBiblioteca.getListaDeLivros().size());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Dados da biblioteca: \n" + objBiblioteca);
                    break;
                case 5:
                    if (objBiblioteca.getListaDeLivros().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não existem livros a serem excluídos.");
                    } else {
                        do {
                            op = Byte.parseByte(JOptionPane.showInputDialog("Deseja realmente excluir os livros?\n"
                                    + "1 - Sim\n"
                                    + "2 - Não"));
                            switch (op) {
                                case 1:
                                    objBiblioteca.getListaDeLivros().clear();
                                    JOptionPane.showMessageDialog(null, "Livros excluídos com sucesso.");
                                    break;
                                case 2:
                                    JOptionPane.showMessageDialog(null, "Exclusãp cancelada.");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opção inválida, digite novamente.");
                            }
                        } while (op < 1 || op > 2);
                    }
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida, digite novamente.");
            }
        } while (op != 0);

    }

}
