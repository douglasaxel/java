
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nome = null;
        long cpf = 0;
        double valorHora = 0;
        double cargaHoraria = 0;
        double valorTotalPassagem = 0;
        
        Funcionario objFuncionario = new Funcionario(nome, cpf, valorHora, cargaHoraria, valorTotalPassagem);
        
        objFuncionario.setNome(JOptionPane.showInputDialog("Digite o nome do Funcionário:"));
        objFuncionario.setCpf(Long.parseLong(JOptionPane.showInputDialog("Digite o cpf do funcionário:")));
        objFuncionario.setValorHora(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor hora:")));
        objFuncionario.setCargaHoraria(Double.parseDouble(JOptionPane.showInputDialog("Digite a carga horária:")));
        
        do{
            byte op;
            JOptionPane.showInputDialog("");
            switch(op){
                case 0:
                    objFuncionario.cancelarVT();
                break;
                case 1:
                    objFuncionario.calcularVT();
                break;
                default:
                JOptionPane.showInternalMessageDialog(null, "ESCOLHE CERTO O FILHA DA PULTA");
            }
        }     
        
        objFuncionario.setValorTotalPassagem(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total da passagem:")));
        
        
    }
    
}
