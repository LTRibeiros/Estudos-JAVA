import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 10.	Receba 2 números reais. Calcule e mostre a diferença desses valores.
 * @author Particular
 */
public class LT01_Ex10 {
   
   public static void main (String args []) {
       
       double a,b,c;
       
       
       a = Integer.parseInt(JOptionPane.showInputDialog("Valor do primeiro número"));
       b = Integer.parseInt(JOptionPane.showInputDialog("Valor do segundo número"));
       
       c = (a - b);
       
       JOptionPane.showMessageDialog(null, "Diferença do primeiro e do segundo número:" + c);
       
       
   }
   
}

       
               
       
               
               
            
               
