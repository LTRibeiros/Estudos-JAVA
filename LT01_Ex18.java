import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class LT01_Ex18 {

    /**
     * @param args the command line arguments
     */ 
    //Receba 2 valores inteiros
    // Calcule e mostre o resultado da diferença do maior pelo menos valor.
    public static void main(String[] args) {
        
      double a,b,x;
      
      a = Integer.parseInt(JOptionPane.showInputDialog("Valor de a:"));
      b = Integer.parseInt(JOptionPane.showInputDialog("Valor de b:"));
      
      if (a > b) {
              
           x = (a - b);
                   }
      else {
          x = (b - a);
                  
                  }
      
      JOptionPane.showMessageDialog(null, "Valor da diferença entre o maior e o menor: " + x);
      
      }
          
       
    }
    

