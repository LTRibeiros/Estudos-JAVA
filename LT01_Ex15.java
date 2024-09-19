import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 15.	Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
 * @author Particular
 */
public class LT01_Ex15 {
    public static void main (String args []) {
        
        double Cat1, Cat2, Hip;
        
        Cat1 = Integer.parseInt(JOptionPane.showInputDialog("Valor do primeiro cateto:"));
        Cat2 = Integer.parseInt(JOptionPane.showInputDialog("Valor do segundo cateto:"));
        
        // a^2 + b^2 = c^2
        Cat1 = (Cat1 * Cat1);
        Cat2 = (Cat2 * Cat2);
        
        Hip = (Cat1 + Cat2);
        Hip = Math.sqrt(Hip);
        
        JOptionPane.showMessageDialog(null, "Valor da hipotenusa: " + Hip);
                
        
    }
}
