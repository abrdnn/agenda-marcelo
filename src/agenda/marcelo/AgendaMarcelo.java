package agenda.marcelo;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class AgendaMarcelo {

    
    public static void main(String[] args) {
        
        String modo = JOptionPane.showInputDialog("Escolha o modo: Console ou Swing");
        if ("Console".equalsIgnoreCase(modo)) {
            new AgendaConsole().inicio();
        } else if ("Swing".equalsIgnoreCase(modo)) {
            SwingUtilities.invokeLater(() -> new AgendaSwing().setVisible(true));
        } else {
            System.out.println("invalido...");
        }
        
    }
    
}
