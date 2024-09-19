
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class LT01_TestExSec02 
{
  public static void main(String args []){
      
        
    int Lado,Area;
  
   Lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado:"));  

 
   Area =(Lado * Lado); 
  
   JOptionPane.showMessageDialog(null,"A area do quadrado é:" + Area);
  
}
}        



