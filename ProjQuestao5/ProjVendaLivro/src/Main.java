
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        Venda objVenda = new Venda();
        
        objVenda.getObjLivro().setTitulo(JOptionPane.showInputDialog("Digite o nome do livro 1"));
        objVenda.getObjLivro().setAutor(JOptionPane.showInputDialog("Digite o nome do autor do livro 1"));
        objVenda.getObjLivro().setIsbn(Long.parseLong(JOptionPane.showInputDialog("Digite o ISBN do livro 1")));
        objVenda.getObjLivro().setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do livro 1")));
        objVenda.getObjLivro().getDataLancamento().setDia(Byte.parseByte(JOptionPane.showInputDialog("Digite a data de lançamento do livro 1\n"
                + "Dia: ")));
        objVenda.getObjLivro().getDataLancamento().setMes(Byte.parseByte(JOptionPane.showInputDialog("Digite a data de lançamento do livro 1\n"
                + "Dia: "+objVenda.getObjLivro().getDataLancamento().getDia()+"\n"
                + "Mês: ")));
        objVenda.getObjLivro().getDataLancamento().setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite a data de lançamento do livro 1\n"
                + "Dia: "+objVenda.getObjLivro().getDataLancamento().getDia()+"\n"
                + "Mês: "+objVenda.getObjLivro().getDataLancamento().getMes())));
        
        objVenda.getObjLivro1().setTitulo(JOptionPane.showInputDialog("Digite o nome do livro 2"));
        objVenda.getObjLivro1().setAutor(JOptionPane.showInputDialog("Digite o nome do autor do livro 2"));
        objVenda.getObjLivro1().setIsbn(Long.parseLong(JOptionPane.showInputDialog("Digite o ISBN do livro 2")));
        objVenda.getObjLivro1().setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do livro 2")));
        objVenda.getObjLivro1().getDataLancamento().setDia(Byte.parseByte(JOptionPane.showInputDialog("Digite a data de lançamento do livro 2\n"
                + "Dia: ")));
        objVenda.getObjLivro1().getDataLancamento().setMes(Byte.parseByte(JOptionPane.showInputDialog("Digite a data de lançamento do livro 2\n"
                + "Dia: "+objVenda.getObjLivro1().getDataLancamento().getDia()+"\n"
                + "Mês: ")));
        objVenda.getObjLivro1().getDataLancamento().setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite a data de lançamento do livro 2\n"
                + "Dia: "+objVenda.getObjLivro1().getDataLancamento().getDia()+"\n"
                + "Mês: "+objVenda.getObjLivro1().getDataLancamento().getMes())));
        
        JOptionPane.showMessageDialog(null, objVenda.toString()+"\n"
                + "Valor total a pagar: "+objVenda.calcularVenda());
        

    }
    
}
