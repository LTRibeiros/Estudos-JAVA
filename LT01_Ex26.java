import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 26.	Receba 2 números inteiros. 
 * Verifique e mostre se o maior número é múltiplo do menor.
 * @author Particular
 */
public class LT01_Ex26 {
    public static void main (String args []) {
        
        int a, b, div;
        
       a = Integer.parseInt(JOptionPane.showInputDialog("Valor de a: ")); 
       b = Integer.parseInt(JOptionPane.showInputDialog("Valor de b: "));
       
       if (a > b) {
           div = (a % b);
         if (div != 0) {
            JOptionPane.showMessageDialog(null,+ a + " não é multiplo de " + b);
         } 
         else {
          JOptionPane.showMessageDialog(null,+ a + " é multiplo de " + b);          
                    } 
         }
           
       if (b > a) {
           div = (b % a);
         if (div != 0) {
            JOptionPane.showMessageDialog(null,+ b + " não é multiplo de " + a);
         } 
         else {
          JOptionPane.showMessageDialog(null,+ b + " é multiplo de " + a);          
                    } 
         }
          
           
       }
       
    }

