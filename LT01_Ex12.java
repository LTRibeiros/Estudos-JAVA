import javax.swing.JOptionPane;

/* 12.	Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Particular
 */
public class LT01_Ex12 {
    
    public static void main (String args []) {
        
        int Nas, Atu, Idade, IdadeF;
        
        Nas = Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento:"));
        Atu = Integer.parseInt(JOptionPane.showInputDialog("Ano atual"));
        
        Idade = (Atu - Nas);
        IdadeF = (Idade + 17);
        
        JOptionPane.showMessageDialog(null, "Idade:" + Idade);
        JOptionPane.showMessageDialog(null, "Idade daqui 17 anos:" + IdadeF);
        
        
         
       
    }
}
