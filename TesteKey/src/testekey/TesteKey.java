package testekey;

import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class TesteKey extends JFrame {

    public TesteKey() {
        setTitle("KeyListener");
        setSize(50, 50);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                char letra = e.getKeyChar();
                int code = e.getKeyCode();

                switch (code) {
                    case KeyEvent.VK_BACK_SPACE:
                        System.out.print("Back_Space ");
                        break;
                    case KeyEvent.VK_ENTER:
                        System.out.print("Enter ");
                        break;
                    case KeyEvent.VK_SPACE:
                        System.out.print("Space ");
                        break;
                    case KeyEvent.VK_SHIFT:
                        System.out.print("Shift ");
                    default:
                        System.out.print(letra + " ");
                        break;
                }
            }
        });
    }

    public static void main(String[] args) {
        TesteKey testeKey = new TesteKey();

    }

}
