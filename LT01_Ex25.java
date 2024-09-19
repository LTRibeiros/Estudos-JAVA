import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Receba a hora de início e de final de um jogo (HH,MM) sabendo que o
tempo máximo é de 24 horas e pode começar num dia e terminar noutro.
 * @author FATEC ZONA LESTE
 */
public class LT01_Ex25 {
   public static void main (String args []){
       
   
   
    int  hi_, hf, mi, mf, hv, mv;
   
   hi_ = Integer.parseInt(JOptionPane.showInputDialog("Hora inicial: "));
     hf = Integer.parseInt(JOptionPane.showInputDialog("Hora final: "));
   mi = Integer.parseInt(JOptionPane.showInputDialog("Minuto Inicial: "));
     mf = Integer.parseInt(JOptionPane.showInputDialog("minuto final: "));
     
    hv = (hf - hi_);
    if (hv < 0) {
        hv = (hv + 24);
          
    }   
    
    mv = (mf - mi);
    if (mv < 0) {
        mv = (mv + 60);
        hv = (hv - 1);
    }
        JOptionPane.showMessageDialog(null, "Hora final: " + hv);
        JOptionPane.showMessageDialog(null, "Minuto final: " + mv);
    }
}

