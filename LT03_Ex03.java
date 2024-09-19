import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. P. ex:
VT1|    1|    2|    3|    |VT2|    4|    5|    6|    |VT3|    1|    2|    3|    4|    5|    6
 * @author Particular
 */
public class LT03_Ex03 {
    public static void main (String args []) {
        
        int VT1 [] = new int [3];
        int VT2 [] = new int [3];
        int VT3 [] = new int [6];
        
        int x, y, z;
        
        for (x = 0; x < 3; x ++) {
        VT1 [x] = Integer.parseInt(JOptionPane.showInputDialog("Valor do Vetor 1: " ));
        VT3 [x] = VT1 [x];
    }
        for (y = 0; y < 3; y ++) {
        VT2 [y] = Integer.parseInt(JOptionPane.showInputDialog("Valor do Vetor 2: " ));
        z = (y + 3);
        VT3 [z] = VT2 [y];
    }
        
        for (y = 0; y < 6; y ++) {
           
          System.out.print(" " + VT3[y]);
          
        }
}
}