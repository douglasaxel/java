
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Cliente objCliente1 = new Cliente();
        Cliente objCliente2 = new Cliente();
        Cliente objCliente3 = new Cliente();
        
        objCliente1.nome = JOptionPane.showInputDialog("Digite o nome do cliente 1");
        objCliente1.cpf = JOptionPane.showInputDialog("Digite o cpf do cliente 1");
        objCliente1.rg = JOptionPane.showInputDialog("Digite o rg do cliente 1");
        objCliente1.endereco = JOptionPane.showInputDialog("Digite o endereço do cliente 1");
        objCliente1.rendaBruta = Double.parseDouble(JOptionPane.showInputDialog("Digite a renda bruta do cliente 1"));
        objCliente1.limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite do cliente 1"));
        
        objCliente2.nome = JOptionPane.showInputDialog("Digite o nome do cliente 2");
        objCliente2.cpf = JOptionPane.showInputDialog("Digite o cpf do cliente 2");
        objCliente2.rg = JOptionPane.showInputDialog("Digite o rg do cliente 2");
        objCliente2.endereco = JOptionPane.showInputDialog("Digite o endereço do cliente 2");
        objCliente2.rendaBruta = Double.parseDouble(JOptionPane.showInputDialog("Digite a renda bruta do cliente 2"));
        objCliente2.limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite do cliente 2"));
        
        objCliente3.nome = JOptionPane.showInputDialog("Digite o nome do cliente 3");
        objCliente3.cpf = JOptionPane.showInputDialog("Digite o cpf do cliente 3");
        objCliente3.rg = JOptionPane.showInputDialog("Digite o rg do cliente 3");
        objCliente3.endereco = JOptionPane.showInputDialog("Digite o endereço do cliente 3");
        objCliente3.rendaBruta = Double.parseDouble(JOptionPane.showInputDialog("Digite a renda bruta do cliente 3"));
        objCliente3.limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite do cliente 3"));
        
        JOptionPane.showMessageDialog(null, "Nome do cliente 1: "+objCliente1.nome+"\n"
            + "CPF: "+objCliente1.cpf+"\n"
            + "RG: "+objCliente1.rg+"\n"
            + "Endereço: "+objCliente1.endereco+"\n"
            + "Renda bruta: "+objCliente1.rendaBruta+"\n"
            + "Limite: "+objCliente1.limite+"\n\n"
            + "Nome do cliente 2: "+objCliente1.nome+"\n"
            + "CPF: "+objCliente2.cpf+"\n"
            + "RG: "+objCliente2.rg+"\n"
            + "Endereço: "+objCliente2.endereco+"\n"
            + "Renda bruta: "+objCliente2.rendaBruta+"\n"
            + "Limite: "+objCliente2.limite+"\n\n"
            + "Nome do cliente 3: "+objCliente3.nome+"\n"
            + "CPF: "+objCliente3.cpf+"\n"
            + "RG: "+objCliente3.rg+"\n"
            + "Endereço: "+objCliente3.endereco+"\n"
            + "Renda bruta: "+objCliente3.rendaBruta+"\n"
            + "Limite: "+objCliente3.limite+"\n\n");
    }
    
}
