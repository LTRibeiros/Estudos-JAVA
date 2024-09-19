import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Particular
 */
public class LT01_Ex03 {
    
    public static void main (String args []) {
        
       double Base,altura,area; 
       
       Base = Integer.parseInt(JOptionPane.showInputDialog("Valor da base:"));
       altura = Integer.parseInt(JOptionPane.showInputDialog("Altura:"));
       
      area = ((Base * altura) / 2); 
      
      JOptionPane.showMessageDialog(null,"Valor da area do triângulo:" + area);
      
    }
}
