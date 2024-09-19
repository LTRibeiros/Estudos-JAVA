import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 4.	Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.
 * @author Particular
 */
public class LT01_Ex04 {
    
    public static void main (String args []) {
        
        double G, F;
        
       G = Integer.parseInt(JOptionPane.showInputDialog("Quantos Graus?:"));
       //Multiplicamos a temperatura em ºC por 1,8 e somamos 32 ao resultado.
       F = (G * 1.8);
       F = (F + 32);
       
       JOptionPane.showMessageDialog(null,"Graus em fahrenheit:" + F);
       
               
    }
}
