import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Particular
 */
public class LT01_Ex33 {
    public static void main (String args []) {
        
      double N, soma = 0;
      
      N = Integer.parseInt(JOptionPane.showInputDialog("Limite da série: "));
      
      for (N = N; N > 0; N --) {
      
      soma = 1/N + soma;
      } 
      JOptionPane.showMessageDialog(null, "Valor da série: " + soma);
      
       
    }
    }


