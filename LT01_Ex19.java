import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class LT01_Ex19 {
    public static void main (String args []){
        
        double a,b;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Valor de a: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Valor de b: "));
        
        if (a > b) {
        JOptionPane.showMessageDialog(null, "Maior valor: " + a);
        }
   
        else {
        JOptionPane.showMessageDialog(null, "Maior valor: " + b);
    }    
        
    }
}    
    
