
package lertexto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class LerTexto {
    
    public static void main(String[] args) {
        
        Path url = Paths.get("C:/Users/dougl/Desktop/teste.txt");
        
        try {
            
            String escreverTexto = JOptionPane.showInputDialog("O que deseja anotar?");
            byte[] txtWriteByte = escreverTexto.getBytes();
            Files.write(url, txtWriteByte);
            
            byte[] txtByte = Files.readAllBytes(url);
            String lerTexto = new String(txtByte);
            JOptionPane.showMessageDialog(null, lerTexto);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Caminho não encontrado" + e);
        }
    }
    
}
