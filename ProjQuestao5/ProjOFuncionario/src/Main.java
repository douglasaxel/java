
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String nome = null, cpf = null, endereco = null, fone = null;
        int chapa = 0;
        double valorHora = 0;
        byte op = 0, op2 = 0;

        do {
            op2 = 0;
            nome = JOptionPane.showInputDialog("Cadastro do funcionário\n"
                    + "\nDigite o nome do funcionário");
            do {
                if (nome == null || nome.isEmpty()) {
                    nome = JOptionPane.showInputDialog("Cadastro do funcionário\n"
                            + "\nVocê não informou o nome do funcionário");
                }
            } while (nome == null || nome.isEmpty());

            cpf = JOptionPane.showInputDialog("Cadastro do funcionário\n"
                    + "\nDigite o cpf do funcionário");
            do {
                if (cpf == null || cpf.isEmpty()) {
                    cpf = JOptionPane.showInputDialog("Cadastro do funcionário\n"
                            + "\nVocê não informou o cpf do funcionário");
                }
            } while (cpf == null || cpf.isEmpty());

            endereco = JOptionPane.showInputDialog("Cadastro do funcionário\n"
                    + "\nDigite o endereco do funcionário");
            do {
                if (endereco == null || endereco.isEmpty()) {
                    endereco = JOptionPane.showInputDialog("Cadastro do funcionário\n"
                            + "\nVocê não informou o endereco do funcionário");
                }
            } while (endereco == null || endereco.isEmpty());

            fone = JOptionPane.showInputDialog("Cadastro do funcionário\n"
                    + "\nDigite o telefone do funcionário");
            do {
                if (fone == null || fone.isEmpty()) {
                    fone = JOptionPane.showInputDialog("Cadastro do funcionário\n"
                            + "\nVocê não informou o telefone do funcionário");
                }
            } while (fone == null || fone.isEmpty());

            chapa = Integer.parseInt(JOptionPane.showInputDialog("Cadastro do funcionário\n"
                    + "\nDigite a chapa do funcionário"
                    + "\nExemplo '555'"));
            do {
                if (chapa < 100 || chapa > 999 || chapa == 0) {
                    chapa = Integer.parseInt(JOptionPane.showInputDialog("Cadastro do funcionário\n"
                            + "\nVocê não informou a chapa do funcionário"
                            + "\nExemplo '555'"));
                }
            } while (chapa < 100 || chapa > 999 || chapa == 0);

            valorHora = Double.parseDouble(JOptionPane.showInputDialog("Cadastro do funcionário\n"
                    + "\nDigite o ganho por hora do funcionário"));
            do {
                if (valorHora == 0) {
                    valorHora = Double.parseDouble(JOptionPane.showInputDialog("Cadastro do funcionário\n"
                            + "\nVocê não informou o ganho por hora do funcionário"));
                }
            } while (valorHora == 0);

            Funcionario objFuncionario = new Funcionario(nome, cpf, endereco, fone, chapa, valorHora);

            objFuncionario.setRg(JOptionPane.showInputDialog("Cadastro do funcionário\n"
                    + "\nDigite o rg do funcionário"));
            do {
                if (objFuncionario.getRg() == null || objFuncionario.getRg().isEmpty()) {
                    objFuncionario.setRg(JOptionPane.showInputDialog("Cadastro do funcionário\n"
                            + "\nVocê não informou o rg do funcionário"));
                }
            } while (objFuncionario.getRg() == null || objFuncionario.getRg().isEmpty());

            objFuncionario.setCargo(JOptionPane.showInputDialog("Cadastro do funcionário\n"
                    + "\nDigite o cargo do funcionário"));
            do {
                if (objFuncionario.getCargo() == null || objFuncionario.getCargo().isEmpty()) {
                    objFuncionario.setCargo(JOptionPane.showInputDialog("Cadastro do funcionário\n"
                            + "\nVoce não informou o cargo do funcionário"));
                }
            } while (objFuncionario.getCargo() == null || objFuncionario.getCargo().isEmpty());

            objFuncionario.setEmail(JOptionPane.showInputDialog("Cadastro do funcionário\n"
                    + "\nDigite o e-mail do funcionário"));
            do {
                if (objFuncionario.getEmail() == null || objFuncionario.getEmail().isEmpty()) {
                    objFuncionario.setEmail(JOptionPane.showInputDialog("Cadastro do funcionário\n"
                            + "\nVocê não informou o e-mail do funcionário"));
                }
            } while (objFuncionario.getEmail() == null || objFuncionario.getEmail().equals(""));

            objFuncionario.setQtdDependentes(Integer.parseInt(JOptionPane.showInputDialog("Cadastro do funcionário\n"
                    + "\nDigite a quantidade de dependentes do funcionário")));
            do {
                if (objFuncionario.getQtdDependentes() < 0) {
                    objFuncionario.setQtdDependentes(Integer.parseInt(JOptionPane.showInputDialog("Cadastro do funcionário\n"
                            + "\nVocê não informou a quantidade de dependentes do funcionário")));
                }
            } while (objFuncionario.getQtdDependentes() < 0);

            objFuncionario.setCargaHorariaBase(Double.parseDouble(JOptionPane.showInputDialog("Cadastro do funcionário\n"
                    + "\nDigite a carga horaria base do funcionário")));
            do {
                if (objFuncionario.getCargaHorariaBase() < 0) {
                    objFuncionario.setCargaHorariaBase(Double.parseDouble(JOptionPane.showInputDialog("Cadastro do funcionário\n"
                            + "\nVocê não informou a carga horaria base do funcionário")));
                }
            } while (objFuncionario.getCargaHorariaBase() < 0);

            objFuncionario.setQtdHorasExtras(Double.parseDouble(JOptionPane.showInputDialog("Cadastro do funcionário\n"
                    + "\nDigite a quantidade de horas extras do funcionário")));
            do {
                if (objFuncionario.getQtdHorasExtras() < 0) {
                    objFuncionario.setQtdHorasExtras(Double.parseDouble(JOptionPane.showInputDialog("Cadastro do funcionário\n"
                            + "\nVocê não informou a quantidade de horas extras do funcionário")));
                }
            } while (objFuncionario.getQtdHorasExtras() < 0);

            objFuncionario.setTempoDeServicoAno(Integer.parseInt(JOptionPane.showInputDialog("Cadastro do funcionário\n"
                    + "\nDigite o tempo de serviço do funcionário")));
            do {
                if (objFuncionario.getTempoDeServicoAno() < 0) {
                    objFuncionario.setTempoDeServicoAno(Integer.parseInt(JOptionPane.showInputDialog("Cadastro do funcionário\n"
                            + "\nVocê não informou o tempo de serviço do funcionário")));
                }
            } while (objFuncionario.getTempoDeServicoAno() < 0);

            do {
                op = Byte.parseByte(JOptionPane.showInputDialog("Cadastro do funcionário\n"
                        + "\nO funcionário recebe VT?"
                        + "\n1 - Sim"
                        + "\n2 - Não"));
                switch (op) {
                    case 1:
                        objFuncionario.receberVT();
                        break;
                    case 2:
                        objFuncionario.cancelarVT();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Incorreto, digite novamente");
                }
            } while (op < 1 || op > 2);

            if (objFuncionario.opcaoVT == true) {
                objFuncionario.setValorTotalPassagem(Double.parseDouble(JOptionPane.showInputDialog("Cadastro do funcionário\n"
                        + "\nDigite o valor total das passagens do funcionário")));
                do {
                    if (objFuncionario.getValorTotalPassagem() < 0) {
                        objFuncionario.setValorTotalPassagem(Double.parseDouble(JOptionPane.showInputDialog("Cadastro do funcionário\n"
                                + "\nVocê não informou o valor total das passagens do funcionário")));
                    }
                } while (objFuncionario.getValorTotalPassagem() < 0);
            }

            do {
                op = Byte.parseByte(JOptionPane.showInputDialog("Cadastro do funcionário\n"
                        + "\nEscolha o grau de insalubridade do funcionário"
                        + "\n1 - 10%"
                        + "\n2 - 20%"
                        + "\n3 - 40%"));
                switch (op) {
                    case 1:
                        objFuncionario.setGrauInsalubridade(op);
                        break;
                    case 2:
                        objFuncionario.setGrauInsalubridade(op);
                        break;
                    case 3:
                        objFuncionario.setGrauInsalubridade(op);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Incorreto, digite novamente");
                }
            } while (objFuncionario.getGrauInsalubridade() > 3 || objFuncionario.getGrauInsalubridade() < 1);

            do {
                op = Byte.parseByte(JOptionPane.showInputDialog("Cadastro do funcionário\n"
                        + "\nEscolha o sexo do funcionário"
                        + "\n1 - Masculino"
                        + "\n2 - Feminino"));
                switch (op) {
                    case 1:
                        objFuncionario.setSexo("Masculino");
                        break;
                    case 2:
                        objFuncionario.setSexo("Feminino");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Incorreto, digite novamente");
                }
            } while (objFuncionario.getSexo() == null || objFuncionario.getSexo().isEmpty());

            //A partir daqui é o menu para mostrar os dados coletados
            do {
                op = Byte.parseByte(JOptionPane.showInputDialog("1 - Mostrar nome e salário bruto\n"
                        + "2 - Mostrar nome e valor de horas extras\n"
                        + "3 - Mostrar nome e valor do VT\n"
                        + "4 - Mostrar nome e valor do INSS\n"
                        + "5 - Mostrar nome e valor da insalubridade\n"
                        + "6 - Mostrar nome e valor do salário família\n"
                        + "7 - Mostrar nome e valor do plano de carreira\n"
                        + "8 - Mostrar nome e valor do plano de saúde\n"
                        + "9 - Mostrar nome e valor do salário líquido\n"
                        + "10 - Mostrar todos os dados e cálculos do funcionário\n"
                        + "11 - Cadastrar novo funcionário\n"
                        + "0 - Sair do sistema\n\n"
                        + "Digite aqui sua opção"));
                switch (op) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Nome: " + objFuncionario.getNome() + "\n"
                                + "Salário bruto: " + objFuncionario.calcularSalarioBruto());
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Nome: " + objFuncionario.getNome() + "\n"
                                + "Horas extras: " + objFuncionario.calcularHoraExtra());
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Nome: " + objFuncionario.getNome() + "\n"
                                + "Valor VT: " + objFuncionario.getValorTotalPassagem());
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Nome: " + objFuncionario.getNome() + "\n"
                                + "INSS: " + objFuncionario.calcularINSS());
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Nome: " + objFuncionario.getNome() + "\n"
                                + "Insalubridade: " + objFuncionario.calcularInsalubridade());
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Nome: " + objFuncionario.getNome() + "\n"
                                + "Salário família: " + objFuncionario.calcularSalarioFamilia());
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Nome: " + objFuncionario.getNome() + "\n"
                                + "Plano de carreira: " + objFuncionario.calcularPlanoDeCarreira());
                        break;
                    case 8:
                        JOptionPane.showMessageDialog(null, "Nome: " + objFuncionario.getNome() + "\n"
                                + "Plano de saúde: " + objFuncionario.calcularPlanoDeSaude());
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Nome: " + objFuncionario.getNome() + "\n"
                                + "Salário líquido: " + objFuncionario.calcularSalarioLiquido());
                        break;
                    case 10:
                        JOptionPane.showMessageDialog(null, objFuncionario.toString());
                        break;
                    case 11:
                        op = Byte.parseByte(JOptionPane.showInputDialog("\nFuncionário cadastrado..."
                                + "\nCadastrar outro?"
                                + "\n1 - Sim"
                                + "\n2 - Não"));
                        switch (op) {
                            case 1:
                                op2 = 1;
                                JOptionPane.showMessageDialog(null, "Reinicializando sistema...");
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Clique em OK para continuar o programa");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Valor Inválido, digite novamente");
                        }
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Saindo... ");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Valor Inválido, digite novamente");
                }
            } while (op != 0 && op2 != 1);
        } while (op != 0 && op2 == 1);
    }
}
