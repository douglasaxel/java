
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        Aluno objAluno = new Aluno();
        Aluno objAluno1 = new Aluno();
        
        objAluno.nome = JOptionPane.showInputDialog("Digite o nome do aluno 1");
        objAluno.ra = Long.parseLong(JOptionPane.showInputDialog("Digite o ra do aluno 1"));
        objAluno.nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota 1"));
        objAluno.nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota 1"));
        
        objAluno1.nome = JOptionPane.showInputDialog("Digite o nome do aluno 1");
        objAluno1.ra = Long.parseLong(JOptionPane.showInputDialog("Digite o ra do aluno 1"));
        objAluno1.nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota 1"));
        objAluno1.nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota 1"));
        
        JOptionPane.showMessageDialog(null, "Dados do aluno 1\n"
                + "Nome: "+objAluno.nome+"\n"
                + "RA: "+objAluno.ra+"\n"
                + "Nota 1: "+objAluno.nota1+"\n"
                + "Nota 2: "+objAluno.nota2+"\n"
                + "Média "+objAluno.calcularMedia()+"\n\n"
                + "Dados do aluno 1\n"
                + "Nome: "+objAluno1.nome+"\n"
                + "RA: "+objAluno1.ra+"\n"
                + "Nota 1: "+objAluno1.nota1+"\n"
                + "Nota 2: "+objAluno1.nota2+"\n"
                + "Média "+objAluno1.calcularMedia());        
    }
    
}
