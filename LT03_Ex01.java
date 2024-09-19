import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Criar e coletar um vetor [50] inteiro. Calcular e exibir:
   a. A média dos valores entre 10 e 200;
   b. A soma dos números ímpares.
 * @author FATEC ZONA LESTE
 */

public class LT03_Ex01 {
    public static void main (String args []) {
        
        int vetor [] = new int [50];
        int soma = 0, x, i, c = 0, imp = 0;
       
       for (i = 0; i < 5; i++) {
        vetor [i] = Integer.parseInt(JOptionPane.showInputDialog("Valor do vetor " + i));
    
        if (vetor[i] > 10 && vetor [i] < 200) {
            soma = vetor [i] + soma;
            c = c + 1;
            //System.out.print(" P_M " + soma);
           
        }
             
        if (vetor[i] % 2 == 1) {
            imp = vetor[i] + imp;
            //System.out.print("P_I " + imp);
        }
            
            
        
        }
        
        soma = soma / c;
        JOptionPane.showMessageDialog(null, "Média: " + soma);
        JOptionPane.showMessageDialog(null, "Soma dos ímpares: " +imp);
        
        
        
        
        
         
   

       
}
}
