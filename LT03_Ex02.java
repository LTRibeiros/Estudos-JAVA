import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Criar e coletar um vetor [100] inteiro e exibir:
   a.    O maior e o menor valor;
   b.    A média dos valores.
 * @author Particular
 */
public class LT03_Ex02 {
    public static void main (String args []) {
        
    int vetor[] = new int [100];
    
    int x, maior, menor, soma = 0, media, y, aux;
    
      vetor [0] = Integer.parseInt(JOptionPane.showInputDialog("Valor do vetor " + 0 +": "));
     maior = vetor [0];
     menor = vetor [0];
        soma = vetor [0] + soma;
    for (x = 1; x < 100; x ++) {
        
        vetor [x] = Integer.parseInt(JOptionPane.showInputDialog("Valor do vetor " + x +": "));
        soma = vetor [x] + soma;
        
        if (vetor[x] > maior) {
            maior = vetor[x];
        }
        if (vetor[x] < menor) {
            menor = vetor [x];
          }  
        
       }
        
    media = soma / 100;
    
    JOptionPane.showMessageDialog(null, "Média: " + media);
     JOptionPane.showMessageDialog(null, "Menor: " + menor);
      JOptionPane.showMessageDialog(null, "Maior: " + maior);
    
  }
    }
          
        
    
    
    
    
               
            
        

    
        
        
  


    