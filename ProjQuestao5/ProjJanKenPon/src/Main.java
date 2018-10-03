
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        byte usuario = 1;

        do {
            usuario = Byte.parseByte(JOptionPane.showInputDialog("JanKenPon\n"
                    + "1 - Pedra\n"
                    + "2 - Papel\n"
                    + "3 - Tesoura\n"
                    + "0 - sai do jogo\n"));
            Jogo objJogo = new Jogo(usuario);
            if (usuario != 0) {
                JOptionPane.showMessageDialog(null, objJogo + "\n\n"
                        + objJogo.verificarVencedor());
            }
        } while (usuario != 0);
    }
}
