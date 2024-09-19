import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 35.	Receba 2 números inteiros, verifique qual o maior entre eles. 
 * Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
 * @author Particular
 */
public class LT01_Ex35 {
    public static void main (String args []) {
        
        int a, b, c, soma = 0;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Valor de a: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Valor de b: "));
        
        if (a > b) {
          for (c = b; c < a; c ++) {
              if ( c % 2 == 1) {
                  soma = soma + c;
                 System.out.println("soma dos números impares entre a e b: " + soma); 
              }   
                  
              }
              
          }
        else if (b > a) {
            for (c = a; c < b; c ++) {
              if ( c % 2 == 1) {
                  soma = soma + c;
                 System.out.println("soma dos números impares entre a e b: " + soma); 
              }
            
    }
        
     
     
    }
}
}

