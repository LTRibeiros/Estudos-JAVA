import javax.swing.JOptionPane;

/* 11.	Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Particular
 */
public class LT01_Ex11 {
    public static void main (String args []) {
        
        double P,R,C;
        
        P = 3.14;
        
        R = Integer.parseInt(JOptionPane.showInputDialog("Valor do raio:"));
        C = (2 * P * R);
        
        JOptionPane.showMessageDialog(null, "Valor da circunferência:" + C);
        
    }
}
