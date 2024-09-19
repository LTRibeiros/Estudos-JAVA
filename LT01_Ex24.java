
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3
 * @author FATEC ZONA LESTE
 */
public class LT01_Ex24 {
    public static void main (String args []) {
        
        int a, div1, div2;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Valor de a: "));
        
        div1 = (a %2);
        div2 = (a %3);
        
        if (div1 != 0){
         JOptionPane.showMessageDialog(null, "O número " + a + " não é divisivél por 2");
        }
        if (div1 == 0){
         JOptionPane.showMessageDialog(null, "O número " + a + " é divisivél por 2");
        }
        if (div2 != 0){
         JOptionPane.showMessageDialog(null, "O número " + a + " não é divisivél por 3");
         }
        if (div2 == 0){
         JOptionPane.showMessageDialog(null, "O número " + a + " é divisivél por 3");
        }        
    }
}
