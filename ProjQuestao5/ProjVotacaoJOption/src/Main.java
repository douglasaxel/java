
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int chapa1 = 0;
        int chapa2 = 0;
        int chapa3 = 0;
        int voto;
        String ganhador = null;

        int qtdVotador = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos a votar:"));
        int denovo = qtdVotador;
        do {
            voto = Integer.parseInt(JOptionPane.showInputDialog("ELEIÇÕES 2018 GRÊMIO ESTUDANTIL"
                + "\n1 - Chapa 1"
                + "\n2 - Chapa 2"
                + "\n3 - Chapa 3"
                + "\nVotos restantes: "+qtdVotador
                + "\n"
                + "\nInforme seu voto:"));

            switch (voto) {
                case 1:
                    chapa1++;
                    qtdVotador--;
                    break;
                case 2:
                    chapa2++;
                    qtdVotador--;
                    break;
                case 3:
                    chapa3++;
                    qtdVotador--;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"ERRO: Opção inválida, tente novamente!");
            }
        } while (qtdVotador != 0 && chapa1 <= 5 && chapa2 <= 5 && chapa3 <= 5);

        if (chapa1 > chapa2 && chapa1 > chapa3) {
            ganhador = "O ganhador foi a chapa 1";
        } else if (chapa2 > chapa1 && chapa2 > chapa3) {
            ganhador = "O ganhador foi a chapa 2";
        } else if (chapa3 > chapa2 && chapa3 > chapa1) {
            ganhador = "O ganhador foi a chapa 3";
        } else if (chapa1 == chapa2) {
            qtdVotador = denovo;
            do {
                voto = Integer.parseInt(JOptionPane.showInputDialog("::::: ELEIÇÕES 2018 GRÊMIO ESTUDANTIL :::::"
                + "\n                        1 - Chapa 1 ::"
                + "\n                        2 - Chapa 2 ::"
                + "\n                      Votos restantes: "+qtdVotador
                + "\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
                + "\nInforme seu voto:"));

                switch (voto) {
                    case 1:
                        chapa1++;
                        qtdVotador--;
                        break;
                    case 2:
                        chapa2++;
                        qtdVotador--;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"ERRO: Opção inválida, tente novamente!");
                }
            } while (qtdVotador != 0 && chapa1 <= 5 && chapa2 <= 5);

            if (chapa1 > chapa2) {
                ganhador = "O ganhador foi a chapa 1";
            } else {
                ganhador = "O ganhador foi a chapa 2";
            }

        } else if (chapa1 == chapa3) {
            qtdVotador = denovo;
            do {
                voto = Integer.parseInt(JOptionPane.showInputDialog("::::: ELEIÇÕES 2018 GRÊMIO ESTUDANTIL :::::"
                + "\n                        1 - Chapa 1 ::"
                + "\n                        3 - Chapa 3 ::"
                + "\n                      Votos restantes: "+qtdVotador
                + "\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
                + "\nInforme seu voto:"));

                switch (voto) {
                    case 1:
                        chapa1++;
                        qtdVotador--;
                        break;
                    case 3:
                        chapa3++;
                        qtdVotador--;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "ERRO: Opção inválida, tente novamente!");
                }
            } while (qtdVotador != 0 && chapa1 <= 5 && chapa3 <= 5);

            if (chapa1 > chapa3) {
                ganhador = "O ganhador foi a chapa 1";
            } else {
                ganhador = "O ganhador foi a chapa 3";
            }

        } else {
            qtdVotador = denovo;
            do {
                voto = Integer.parseInt(JOptionPane.showInputDialog("::::: ELEIÇÕES 2018 GRÊMIO ESTUDANTIL :::::"
                + "\n                        2 - Chapa 2 ::"
                + "\n                        3 - Chapa 3 ::"
                + "\n                      Votos restantes: "+qtdVotador
                + "\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
                + "\nInforme seu voto:"));

                switch (voto) {
                    case 2:
                        chapa2++;
                        qtdVotador--;
                        break;
                    case 3:
                        chapa3++;
                        qtdVotador--;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "ERRO: Opção inválida, tente novamente!");
                }
            } while (qtdVotador != 0 && chapa2 <= 5 && chapa3 <= 5);

            if (chapa2 > chapa3) {
                ganhador = "O ganhador foi a chapa 2";
            } else {
                ganhador = "O ganhador foi a chapa 3";
            }
        }
        JOptionPane.showMessageDialog(null,ganhador);
    }
}
