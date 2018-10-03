
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Agenda objAgenda = new Agenda();
        byte op = 0;
        int escolha;

        do {
            op = Byte.parseByte(JOptionPane.showInputDialog("==========AGENDA==========\n"
                    + "[1] Adicionar contato\n"
                    + "[2] Remover contato\n"
                    + "[3] Ver contato\n"
                    + "[4] Ver todos os contatos\n"
                    + "[5] Ver quantidade de contatos\n"
                    + "[6] Deletar todos os contatos\n"
                    + "[0] Sair"));
            switch (op) {
                case 1:
                    Contato contato = new Contato();
                    contato.setNome(JOptionPane.showInputDialog("Digite o nome do contato"));
                    contato.setFone(Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone do contato")));
                    objAgenda.getListaDeContatos().add(contato);
                    JOptionPane.showMessageDialog(null, "Contato adicionado com sucesso!");
                    break;
                case 2:
                    escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite qual contato você deseja deletar\n"
                            + objAgenda.retornaListaNomeContatos()));
                    op = Byte.parseByte(JOptionPane.showInputDialog("Tem certeza de quer deletar '" + objAgenda.getListaDeContatos().get(escolha).getNome() + "'da sua agenda?\n"
                            + "[1] Sim\n"
                            + "[2] Não"));
                    if (op == 1) {
                        objAgenda.getListaDeContatos().remove((escolha - 1));
                    } else {
                        JOptionPane.showMessageDialog(null, "Operação cancelada.");
                    }
                    break;
                case 3:
                    escolha = Integer.parseInt(JOptionPane.showInputDialog("Qual contato voce deseja ver? (Digite o nome)\n"
                            + objAgenda.retornaListaNomeContatos()));
                    JOptionPane.showMessageDialog(null, objAgenda.getListaDeContatos().get((escolha - 1)));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, objAgenda);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Total de contatos: " + objAgenda.getListaDeContatos().size());
                    break;
                case 6:
                    op = Byte.parseByte(JOptionPane.showInputDialog("Tem certeza de quer deletar todos os contatos?\n"
                            + "[1] Sim\n"
                            + "[2] Não"));
                    if (op == 1) {
                        objAgenda.getListaDeContatos().clear();
                        JOptionPane.showMessageDialog(null, "Todos os contatos foram deletados!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Operação cancelada.");
                    }
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Sistema encerrado.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Incorreto, digite novamente");
            }//fim do switch
        } while (op != 0);//fim do for
    }//fim do psvm
}//fim da classe
