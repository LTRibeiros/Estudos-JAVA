import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 38.	Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. 
 * Obs.: somente valores positivos.
 * @author Particular
 */
public class LT01_Ex38 {
    public static void main (String args []) {
        
    double menor, maior = 0, num;
    int i;

menor = Integer.parseInt(JOptionPane.showInputDialog("Receber número 1"));      
    for (i = 2; i <= 10; i ++) {
num = Integer.parseInt(JOptionPane.showInputDialog("Receber número " + i )); 
     if (num > maior) {
        
         maior = num;
     }
       else if (num < menor) {
                 
         menor = num;
                 
                 }
     }
        
    JOptionPane.showMessageDialog(null, "Maior: " + maior + "Menor: " + menor);
     }  
   }

