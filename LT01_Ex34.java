import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Particular
 */
public class LT01_Ex34 {
    public static void main (String args []) {
        
        int N, c = 1;
        int r;
        
        N = Integer.parseInt(JOptionPane.showInputDialog("Número pra calcular a tabuada: "));
      
    for (c = c; c < 11; c ++) {
        
       r = function(N, c); 
         
       System.out.println(r);
    }
    
}
   
static int function(int N, int c){
 int conta;
 
 conta = N * c;
 
return conta;
}
}