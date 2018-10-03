
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Locacao objLocacao = new Locacao();
        ArrayList<Livro> livro = objLocacao.getListaDeLivros();
        byte op;

        do {
            op = Byte.parseByte(JOptionPane.showInputDialog(":::::::::::::::::::::: Sistema de Cadastramento ::::::::::::::::::::::\n"
                    + "[1] - Cadastrar funcionário\n"
                    + "[2] - Cadastrar usuário\n"
                    + "[3] - Cadastrar livro\n"
                    + "[4] - Mostrar todos os dados do cadastro\n"
                    + "[0] - Ir para locação"));

            switch (op) {
                case 1:
                    Funcionario objFuncionario = new Funcionario();
                    objFuncionario.setNome(JOptionPane.showInputDialog("Digite o nome do funcionário"));
                    objFuncionario.setCpf(Long.parseLong(JOptionPane.showInputDialog("Digite o CPF do funcionário")));
                    objFuncionario.setChapa(JOptionPane.showInputDialog("Digite a chapa do funcionário"));
                    objFuncionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário")));
                    objFuncionario.getObjEndereco().setRua(JOptionPane.showInputDialog("Digite o nome da rua do funcionário"));
                    objFuncionario.getObjEndereco().setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da residência do funcionário")));
                    objFuncionario.getObjEndereco().setBairro(JOptionPane.showInputDialog("Digite o bairro do funcionário"));
                    objLocacao.getListaDeFuncionarios().add(objFuncionario);
                    JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso.");
                    break;
                case 2:
                    Usuario objUsuario = new Usuario();
                    objUsuario.setNome(JOptionPane.showInputDialog("Digite o nome do Usuário"));
                    objUsuario.setCpf(Long.parseLong(JOptionPane.showInputDialog("Digite o CPF do Usuário")));
                    objUsuario.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do Usuário")));
                    objUsuario.getObjEndereco().setRua(JOptionPane.showInputDialog("Digite a rua do Usuário"));
                    objUsuario.getObjEndereco().setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da residência do Usuário")));
                    objUsuario.getObjEndereco().setBairro(JOptionPane.showInputDialog("Digite o bairro do Usuário"));
                    JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso.");
                    break;
                case 3:
                    Livro objLivro = new Livro();
                    objLivro.setTitulo(JOptionPane.showInputDialog("Digite o titulo do lívro"));
                    objLivro.setAutor(JOptionPane.showInputDialog("Digite o nome do autor do lívro"));
                    objLivro.setGenero(JOptionPane.showInputDialog("Digite o genero do lívro"));
                    livro.add(objLivro);
                    JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso.");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, ":::::::::::::::::Dados do funcionário::::::::::::::::::\n"+ objLocacao);
                    break;
                case 0:
                    do {

                        op = Byte.parseByte(JOptionPane.showInputDialog(null, "::::::::::::::::: Sistema de Locação ::::::::::::::::::\n"
                                + "Escolha uma opção abaixo\n"
                                + "[1] - Locar livro\n"
                                + "[2] - Devolver livro\n"
                                + "[3] - Mostrar os dados do livro locado\n"
                                + "[4] - Mostra os dados do livro devolvido\n"
                                + "[0] - Sair\n"
                                + "Digite aqui a opção:"));

                        switch (op) {
                            case 1:
                                op = Byte.parseByte(JOptionPane.showInputDialog("Escolha o livro que deseja locar \n"
                                        + "[1] - "+objLocacao.getObjLivro().getTitulo()+"\n"
                                        + "[2] - Voltar ao menu"));
                                switch (op) {
                                    case 1:
                                        objLocacao.getDataLocacao().setDia(Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da locação do livro\n"
                                                + "Dia: \n"
                                                + "Mês: \n"
                                                + "Ano: ")));
                                        objLocacao.getDataLocacao().setMes(Integer.parseInt(JOptionPane.showInputDialog("Digite o mes da locação do livro\n"
                                                + "Dia: " + objLocacao.getDataLocacao().getDia())));
                                        objLocacao.getDataLocacao().setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da locação do livro\n"
                                                + "Dia: " + objLocacao.getDataLocacao().getDia() + "\n"
                                                + "Mês: " + objLocacao.getDataLocacao().getMes())));
                                        objLocacao.locarLivro();
                                        objLocacao.setValorLocacao(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de 1 dia de locação")));
                                        break;
                                    case 2:
                                        JOptionPane.showMessageDialog(null, "voltando...");
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "Valor inválido, Digite novamente.");
                                }
                                break;
                            case 2:
                                objLocacao.getDataDevolucao().setDia(Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da locação do livro\n"
                                        + "Dia: \n"
                                        + "Mês: \n"
                                        + "Ano: ")));
                                objLocacao.getDataDevolucao().setMes(Integer.parseInt(JOptionPane.showInputDialog("Digite o mes da locação do livro\n"
                                        + "Dia: " + objLocacao.getDataDevolucao().getDia())));
                                objLocacao.getDataDevolucao().setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da locação do livro\n"
                                        + "Dia: " + objLocacao.getDataDevolucao().getDia() + "\n"
                                        + "Mês: " + objLocacao.getDataDevolucao().getMes())));
                                objLocacao.devolverLivro();
                                objLocacao.setValorMulta(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de 1 dia de multa")));
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, objLocacao.getListaDeLivros().toString());
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, objLocacao.getListaDeLivros().toString());
                                break;
                            case 0:
                                JOptionPane.showMessageDialog(null, "Saindo...");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Valor inválido, Digite novamente.");
                                break;
                        }
                    } while (op != 0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Valor inválido, Digite novamente.");
            }

        } while (op != 0);

    }

}
