import javax.swing.JOptionPane;
import java.io.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Particular
 */
public class MainClass {
    public static void main (String args []) throws IOException {
        
        Aluno[]x = new Aluno[3];
        ClassMetodos m = new ClassMetodos();
        
        int opc = 0;
        
        while(opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastra Aluno \n 2- Mostra Cadastro \n 9- FIM"));
            
            switch(opc){
                
                case 1:
                    x = m.CadastraAluno(x);
                    break;
                    
                case 2: 
                    m.MostraCadastro(x);
                    break;
                    
                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    System.exit(0);
                    
                
                    
            }
        }
        
}
    
}
