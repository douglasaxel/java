import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Produto objProduto = new Produto();
        Produto objProduto1 = new Produto();

        objProduto.setNome(JOptionPane.showInputDialog("Digite o nome do produto"));
        objProduto.setDescricao(JOptionPane.showInputDialog("Digite a descrição do produto"));
        objProduto.setValorUn(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário")));
        objProduto.setQuantidade(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade")));
        
        objProduto1.setNome(JOptionPane.showInputDialog("Digite o nome do produto 2"));
        objProduto1.setDescricao(JOptionPane.showInputDialog("Digite a descrição do produto 2"));
        objProduto1.setValorUn(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário 2")));
        objProduto1.setQuantidade(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade 2")));

        JOptionPane.showMessageDialog(null, objProduto.showAll() + objProduto1.showAll());
    }

}