
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
a. Se a média for >= 6,0 exibir “APROVADO”;
b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c. Se a média for < 3,0 exibir “RETIDO”. 
 * @author FATEC ZONA LESTE
 */
public class NewClass {
    public static void main (String args []) {
        
        double n1, n2, n3, n4, media;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("N1: "));
         n2 = Integer.parseInt(JOptionPane.showInputDialog("N2: "));
          n3 = Integer.parseInt(JOptionPane.showInputDialog("N3: "));
           n4 = Integer.parseInt(JOptionPane.showInputDialog("N4: "));
           
          media = (n1 + n2 + n3 + n4) / 4; 
                  
        if (media >= 6) {
             JOptionPane.showMessageDialog(null, "APROVADO");
        }
             else if (media >= 3) {
                     
                     JOptionPane.showMessageDialog(null, "EXAME");
            }         
             else {
                 JOptionPane.showMessageDialog(null, "RETIDO");
        }
                     
             
        }          
    }    

}
