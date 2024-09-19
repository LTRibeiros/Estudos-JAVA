// sinceramente não sei que porra é JOptionPane, mas ele pede esse import pro código da inputbox
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Particular
 */
public class LT01_Ex01 
{
      
  public static void main(String args []){

      double Salario,Reajuste,Final;
      
    Salario = Integer.parseInt(JOptionPane.showInputDialog("Sálario inicial:"));
    
    Reajuste =(Salario * 0.15);
    Final =(Salario + Reajuste);
    
JOptionPane.showMessageDialog(null,"O salário com o resjuste de 15% é de:" + Final);

       
        
        }
}