
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        Aluno objAluno = new Aluno();
        
        objAluno.nome = JOptionPane.showInputDialog("Digite o nome do aluno");
        objAluno.ra = Long.parseLong(JOptionPane.showInputDialog("Digite o ra do aluno"));
        objAluno.nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota"));
        objAluno.nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota"));
        
        JOptionPane.showMessageDialog(null, "Dados do aluno\n"
                + "Nome: "+objAluno.nome+"\n"
                + "RA: "+objAluno.ra+"\n"
                + "Nota 1: "+objAluno.nota1+"\n"
                + "Nota 2: "+objAluno.nota2+"\n"
                + "Média "+objAluno.calcularMedia()+"\n"
                + "Conceito: "+objAluno.verificarConceito());        
    }
    
}