
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Nadador objNadador = new Nadador();
        
        objNadador.setNome(JOptionPane.showInputDialog("Digite o nome do nadador"));
        objNadador.setIdade(Byte.parseByte(JOptionPane.showInputDialog("Digite a idade do nadador")));
        
        JOptionPane.showMessageDialog(null, objNadador.classificarNadador());
    }
    
}
