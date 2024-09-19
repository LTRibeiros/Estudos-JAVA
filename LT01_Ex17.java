import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 17.	Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
 * @author Particular
 */
public class LT01_Ex17 {
    public static void main (String args []) {
        
        double T, Vm, D, Ql;
        
        T = Integer.parseInt(JOptionPane.showInputDialog("Tempo do percurso:"));
        Vm = Integer.parseInt(JOptionPane.showInputDialog("Velocidade média do percurso::"));
        
        D = (T * Vm);
        Ql = (D / 12);
        
        JOptionPane.showMessageDialog(null, "Quantidade de litros gastos na viagem: " + Ql);
        
    }
}
