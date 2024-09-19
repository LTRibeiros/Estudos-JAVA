import javax.swing.JOptionPane;

/*  13.	Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Particular
 */
public class LT01_Ex13 {
    public static void main (String args []) {
        
        double Kg, dias;
        
        Kg = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Kg:"));
        dias = (Kg / 0.05);
        
        JOptionPane.showMessageDialog(null, "A comida vai durar: " + dias + " dias");
    }
}
