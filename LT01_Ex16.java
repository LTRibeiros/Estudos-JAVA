import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 ** 16.	Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. 
 * Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido 
 * (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
 * @author Particular
 */
public class LT01_Ex16 {
    
    public static void main (String args []) {
        
        double QH, VH, PD, ND, SA, SL, DE;
        
        QH = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de horas trabalhadas:"));
        VH = Integer.parseInt(JOptionPane.showInputDialog("Valor por hora:"));
        PD = Integer.parseInt(JOptionPane.showInputDialog("Percentual de desconto"));
        ND = Integer.parseInt(JOptionPane.showInputDialog("Número de descendentes"));
        
        ND = (ND * 100);
        SA = (QH * VH);
        PD = (PD / 100);
        DE = (SA * PD);
        SL = (SA - DE + ND);
        
        JOptionPane.showMessageDialog(null, "Sálario líquido final:" + SL);
        
        
        
        
        
        
    }
}
