/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package milo.appmenus;
import javax.swing.JFrame;
/**
 *
 * @author camil
 */
public class Appmenus {

    
    
    public static void main(String[] args) {
        frmprincipal principal = new frmprincipal();
        principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        principal.setVisible(true);
    }
}
