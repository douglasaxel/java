package LayoutGrafico;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;

public class Layout extends JFrame implements ActionListener {

    /*
    Tipos de layouts
    BorderLayout - Layout com bordas
    FlowLayout - ordem de chegada
    GridLayout - separado em blocos
     */
    Font calibri = new Font("calibri", Font.PLAIN, 50);
    JLabel label1 = new JLabel("Teste");
    JCheckBox check = new JCheckBox("Checado");
    JRadioButton menino = new JRadioButton("Menino");
    JRadioButton menina = new JRadioButton("Menina");
    ButtonGroup grupo = new ButtonGroup();
    JComboBox<String> combo = new JComboBox<>();
    ImageIcon img = new ImageIcon(getClass().getResource("logo dailytudo.png"));
    JLabel localImg = new JLabel(img);
    JMenuBar menu = new JMenuBar();
    JMenu opcoes = new JMenu("Opções");
    JMenuItem opcoesSair = new JMenuItem("Sair");

    public Layout() {
        setLayout(new FlowLayout());

        setTitle("AnimeHUB");
        setSize(500, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

        add(label1);
        label1.setFont(calibri);

        add(check);
        check.setFont(calibri);

        add(menino);
        add(menina);
        grupo.add(menina);
        grupo.add(menino);
        menina.setFont(calibri);
        menino.setFont(calibri);

        add(combo);
        combo.addItem("Douglas");
        combo.addItem("Jaque");
        combo.addItem("Wagner");
        combo.setSelectedIndex(1);
        combo.setFont(calibri);

        add(localImg);
        
        setJMenuBar(menu);
        menu.add(opcoes);
        opcoes.add(opcoesSair);
        opcoesSair.addActionListener(this);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                char letra = e.getKeyChar();
                System.out.println(e);
            }
        });

        boolean meninoResp = menino.isSelected();
        boolean meninaResp = menina.isSelected();
        boolean checkResp = check.isEnabled();
        String comboResp = String.valueOf(combo.getSelectedItem()); //retorna um object
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == opcoesSair){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Layout layout = new Layout();

    }

}
