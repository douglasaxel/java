
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        Livro objLivro = new Livro();
        
        objLivro.getObjEditora().getObjEndereco().setCidade(JOptionPane.showInputDialog("Digite a cidade da editora"));
        objLivro.getObjEditora().getObjEndereco().setBairro(JOptionPane.showInputDialog("Digite a bairro da editora"));
        objLivro.getObjEditora().getObjEndereco().setRua(JOptionPane.showInputDialog("Digite a rua da editora"));
        objLivro.getObjEditora().getObjEndereco().setCep(Integer.parseInt(JOptionPane.showInputDialog("Digite o CEP da editora")));
        objLivro.getObjEditora().getObjEndereco().setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da editora")));
        
        objLivro.getObjEditora().setNome(JOptionPane.showInputDialog("Digite o nome da editora"));
        objLivro.getObjEditora().setFone(JOptionPane.showInputDialog("Digite o telefone da editora"));
        objLivro.getObjEditora().setCnpj(Long.parseLong(JOptionPane.showInputDialog("Digite o cnpj da editora")));
        
        objLivro.setTitulo(JOptionPane.showInputDialog("Digite o tituto do livro"));
        objLivro.setAutor(JOptionPane.showInputDialog("Digite o nome do autor do livro"));
        objLivro.setGenero(JOptionPane.showInputDialog("Digite o gênero do livro"));
        objLivro.setIsbn(JOptionPane.showInputDialog("Digite o ISBN do livro"));
        
        JOptionPane.showMessageDialog(null, objLivro.toString());
    }
    
}
