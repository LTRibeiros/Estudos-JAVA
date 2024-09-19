import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Criar e coletar em um vetor [30] real e calcular e exibir:
a.    A média do grupo;
b.    A quantidade de notas acima do grupo;
c.    As posições dos valores abaixo da média do grupo.
 * @author Particular
 */
public class LT03_Ex04 {
    public static void main (String args []) {
        
        double VT [] = new double [30];
        
        
        double media, soma = 0 ;
        int x, c= 0;
        
        for (x = 0; x < 10; x ++) {
        VT [x] = Integer.parseInt(JOptionPane.showInputDialog("Nota do aluno " + x));
        soma = soma + VT [x];
        }
        media = soma / 10;
        
        for (x = 0; x < 10; x ++) {
            
           if (VT[x] > media) {
             c = c + 1;
                      
        
           }  
             else {
               System.out.print(" Aluno: " + x);
             
               
               
           } 
        }
        System.out.print(" Quantidade de notas acima do grupo: " + c);
        
    }
}
