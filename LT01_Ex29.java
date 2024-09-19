import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * . Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do
investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a
poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
 * @author dti
 */
public class LT01_Ex28 {
    public static void main (String args []) {
        
       double t, Sal_I, Sal_C, Sal_F; 
        JOptionPane.showMessageDialog(null, "1 = poupança e 2 = renda fixa");
        
        t = Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo de investimento? "));
        
        if (t == 1) {
            Sal_I = Integer.parseInt(JOptionPane.showInputDialog("Valor do investimento: "));
            Sal_C = (Sal_I * 0.03); 
            Sal_F = (Sal_C + Sal_I);
            
        JOptionPane.showMessageDialog(null, "Valor do investimento corrigido: " + Sal_F);
         
        }
        else if (t == 2) {
            Sal_I = Integer.parseInt(JOptionPane.showInputDialog("Valor do investimento: "));
            Sal_C = (Sal_I * 0.05); 
             Sal_F = (Sal_C + Sal_I);
        JOptionPane.showMessageDialog(null, "Valor do investimento corrigido: " + Sal_F);
            
        }
        else {
            JOptionPane.showMessageDialog(null, "Tipo de investimento inválido");
            
        } 
            
    }
}
