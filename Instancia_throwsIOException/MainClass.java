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
        
       Construtor[]Const = new Construtor[10];
       ClassMetodos m = new ClassMetodos ();
       
       int opc = 0;
       
       while (opc != 9) {
        opc = Integer.parseInt(JOptionPane.showInputDialog("1- Carrega Vetor \n 2- Classifica Vetor \n 3- Mostra Vetor \n 9- FIM"));
        
       switch(opc ) {
           
           case 1:
               Const = m.CarregaVetor(Const);
               break;
           case 2:
               Const = m.ClassificaVetor(Const);
               break;
           case 3:
               m.MostraVetor(Const);
               break;
           case 9:
               JOptionPane.showMessageDialog(null, "FIM");
               System.exit(0);
               
       } 
    }
       
       
        
    }
    
}
