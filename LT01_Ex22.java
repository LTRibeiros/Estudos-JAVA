import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 22.	Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 * @author Particular
 */
public class LT01_Ex22 {
    public static void main (String args []) {
        
int a, b;

a = Integer.parseInt(JOptionPane.showInputDialog("Valor de a: "));
b = Integer.parseInt(JOptionPane.showInputDialog("Valor de b: "));

    
    
if (a == b) {
       
       JOptionPane.showMessageDialog(null, "Os valores devem ser diferentes.");
    }        
    
 
     else if (a > b) {
         
 JOptionPane.showMessageDialog(null, "Valores em ordem crescente: " +b + " "  + a);

 }
         
 else  
 {
    JOptionPane.showMessageDialog(null, "Valores em ordem crescente: " +a + " "  + b);
    }     
         
    
    }
}
       
          
   
    
   
    

