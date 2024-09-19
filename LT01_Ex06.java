import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Particular
 */
public class LT01_Ex06 {
    
    public static void main (String args []){
        
        double a,b,aux;
        
       a = Integer.parseInt(JOptionPane.showInputDialog("valor de a:"));
       
       b = Integer.parseInt(JOptionPane.showInputDialog("valor de b:"));
       
       aux = b;
       b = a;
       a = aux;
       
       JOptionPane.showMessageDialog(null, "Valor de a:" + a);
       JOptionPane.showMessageDialog(null, "Valor de b:" + b);
       
       
       
               
               
    }
    
}
