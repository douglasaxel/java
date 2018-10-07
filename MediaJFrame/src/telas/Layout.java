package telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class Layout extends JFrame implements ActionListener{

    Font calibri = new Font("calibri", Font.PLAIN, 50);
    ImageIcon bg = new ImageIcon(getClass().getResource("bg.jpg"));
    JLabel bgImg = new JLabel(bg);
    JLabel bg_do_bg = new JLabel();
    
    public Layout(){
        setLayout(new BorderLayout());
        setTitle("Média Alunos");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
        add(bgImg);
        add(bg_do_bg);
        bg_do_bg.setSize(300, 300);
        bg_do_bg.setBackground(Color.BLACK);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
