
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        Aluno objAluno = new Aluno();
        
        objAluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
        objAluno.setIdade(Byte.parseByte(JOptionPane.showInputDialog("Digite a idade do aluno")));
        objAluno.getObjAvaliacao1().setNota(Double.parseDouble(JOptionPane.showInputDialog("Digite a 1° nota do aluno")));
        objAluno.getObjAvaliacao1().setDescricao(JOptionPane.showInputDialog("Digite a descrição da 1° avaliação"));
        objAluno.getObjAvaliacao2().setNota(Double.parseDouble(JOptionPane.showInputDialog("Digite a 2° nota do aluno")));
        objAluno.getObjAvaliacao2().setDescricao(JOptionPane.showInputDialog("Digite a descrição da 2° avaliação"));
        
        JOptionPane.showMessageDialog(null, "Informações do aluno\n"
                + objAluno.toString());
    }
    
}
