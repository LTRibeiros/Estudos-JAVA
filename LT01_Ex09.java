import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 9.	Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados
 * @author Particular
 */
public class LT01_Ex09 {
    public static void main (String args []) {
        
        int a,b,c;
        
       a = Integer.parseInt(JOptionPane.showInputDialog("Valor do primeiro número:"));
       b = Integer.parseInt(JOptionPane.showInputDialog("Valor do segundo número:"));
       
       a = (a * a);
       b = (b * b);
       
       c = ( a + b);
       
       JOptionPane.showMessageDialog(null, "Soma dos quadrados:" + c);
       
               
              
       
    }
}
