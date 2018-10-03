import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Cao objCao = new Cao();
        Cao objCao1 = new Cao();

        objCao.setNome(JOptionPane.showInputDialog("Digite o nome do Cão 1"));
        objCao.setRaca(JOptionPane.showInputDialog("Digite a Raça do Cão 1"));
        objCao.setCor(JOptionPane.showInputDialog("Digite a cor do Cão 1"));
        objCao.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Cão 1")));
        objCao.setPorte(JOptionPane.showInputDialog("Digite o porte do Cão 1"));
        objCao.setDono(JOptionPane.showInputDialog("Digite o nome do dono do Cão 1"));
        
        objCao1.setNome(JOptionPane.showInputDialog("Digite o nome do Cão 1"));
        objCao1.setRaca(JOptionPane.showInputDialog("Digite a Raça do Cão 2"));
        objCao1.setCor(JOptionPane.showInputDialog("Digite a cor do Cão 2"));
        objCao1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Cão 2")));
        objCao1.setPorte(JOptionPane.showInputDialog("Digite o porte do Cão 2"));
        objCao1.setDono(JOptionPane.showInputDialog("Digite o nome do dono do Cão 2"));

        JOptionPane.showMessageDialog(null, "Informações do cão 1\n"+objCao.showAll()+"Informações do cão 2\n"+objCao1.showAll());
    }

}