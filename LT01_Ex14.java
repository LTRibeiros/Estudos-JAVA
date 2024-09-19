import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 14.	Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo
 * @author Particular
 */
public class LT01_Ex14 {
    
    public static void main (String args []) {
       
       double a,b,c;
       
       a = Integer.parseInt(JOptionPane.showInputDialog("Valor do ângulo a:"));
       b = Integer.parseInt(JOptionPane.showInputDialog("Valor do ângulo b:"));
       
       c = (180 - (a + b));
       
       JOptionPane.showMessageDialog(null, "Valor do ângulo c: " + c );
      
    } 
    
    
}
