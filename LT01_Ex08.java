import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 8.	Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
 * @author Particular
 */
public class LT01_Ex08 {
    
    public static void main (String args []) {
        
        double deposito;
       
        deposito = Integer.parseInt(JOptionPane.showInputDialog("Valor do depósito:"));
        
        deposito = (deposito + (deposito *0.013));
        
        JOptionPane.showMessageDialog(null, "Valor do rendimento:" + deposito);
        
               
    }
}
