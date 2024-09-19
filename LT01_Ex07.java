import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *7. Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume
 * @author Particular
 */
public class LT01_Ex07 {
    
    public static void main(String args []){
        
        double C,L,A,volume;
        
       C = Integer.parseInt(JOptionPane.showInputDialog("Valor do Comprimento:"));
       L = Integer.parseInt(JOptionPane.showInputDialog("Valor da Largura:"));
       A = Integer.parseInt(JOptionPane.showInputDialog("Valor da Altura:"));
       
      volume = (A * L * C);
      
      JOptionPane.showMessageDialog(null, "Volume do paralelepipedo:" + volume);
      
              
            
       
    
}
    
}
