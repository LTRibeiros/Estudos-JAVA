import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Particular
 */
public class LT01_Ex32 {
   public static void main (String args []) {
       
       int num, Fat, c = 1;
       
      num = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
      
      for (Fat = num; Fat > 0; Fat --){
      
      c = Fat * c;
      
      }
      JOptionPane.showMessageDialog(null, "Fatorial de " + num + ": " + c);
      
   }
   
   
}
