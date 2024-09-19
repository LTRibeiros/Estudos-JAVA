import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 27.	Receba o número de voltas, a extensão do circuito 
 * (em metros) e o tempo de duração (minutos). 
 * Calcule e mostre a velocidade média em km/h.
 * @author Particular
 */
public class LT01_Ex27 {
   public static void main (String args []){
       
       double N_vol, Ex, T, Vm;
    
       N_vol = Integer.parseInt(JOptionPane.showInputDialog("Número de voltas: "));
       Ex = Integer.parseInt(JOptionPane.showInputDialog("Extensão do circuito(em metros): "));
       T = Integer.parseInt(JOptionPane.showInputDialog("Tempo de duração (em minutos): "));
       
       Ex = (Ex / 1000);
       T = (T / 60);
       Vm = ((N_vol * Ex) / T);
       
       JOptionPane.showMessageDialog(null, "Velocidade média: " + Vm);
         
   }
    
}
