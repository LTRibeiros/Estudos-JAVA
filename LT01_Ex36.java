import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 36.	Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
 * @author Particular
 */
public class LT01_Ex36 {    
    public static void main (String args []) {
        
      double N, soma = 1, c = 1, x;
      
      N = Integer.parseInt(JOptionPane.showInputDialog("Limite da série: "));
     
    while (N != 1) {
      for (x = 1; x <= N; x ++) {
       
         c = x * c;
      
       soma = 1/c + soma;
        
          }  
            N = N - 1; 
            
    }
      
      System.out.println("Valor da série: " + soma);
      
       
    
    }


}
