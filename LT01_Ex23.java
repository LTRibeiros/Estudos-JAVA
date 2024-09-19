import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não
necessariamente em ordem. Mostre os 4 números em ordem crescente.

 * @author FATEC ZONA LESTE
 */
public class LT01_Ex23 {
    public static void main (String args []) {
        
        int a, b, c, d;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Valor de a: "));
         do 
         {
             b = Integer.parseInt(JOptionPane.showInputDialog("Valor de b: "));
          
         } while (b < a);
         
         do 
         {
          c = Integer.parseInt(JOptionPane.showInputDialog("Valor de c: "));
          
         } while (c < b);
         
         d = Integer.parseInt(JOptionPane.showInputDialog("Valor de d: "));
          
         if (d > c) {
             JOptionPane.showMessageDialog(null,"Sequência: " + a + " " + d + " " + c + " " + d);
         }
         else if (d > b) {
             JOptionPane.showMessageDialog(null,"Sequência: " + a + " " + b + " " + d + " " + c);
         }
         else if (d > a) {
             JOptionPane.showMessageDialog(null,"Sequência: " + a + " " + d + " " + b + " " + c);
         }
         else
             JOptionPane.showMessageDialog(null,"Sequência: " + d + " " + a + " " + b + " " + c);
    }
       
    }
     
    
    


          
          
          
          
    

