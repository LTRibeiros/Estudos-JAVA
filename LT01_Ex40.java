import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 40.	Receba 2 números inteiros. 
 * Verifique e mostre todos os números primos existentes entre eles.
 * @author Particular
 */
public class LT01_Ex40 {
    public static void main (String args []) {
        
int a, b, i;

a = Integer.parseInt(JOptionPane.showInputDialog("Receber a:"));
b = Integer.parseInt(JOptionPane.showInputDialog("Receber b:"));

if (b > a) {

for (i = a + 1; i < b; i ++) {
    if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
     if (i != 2 && i != 3 && i != 5 && i != 7) {
     System.out.println("O número " + i + " nao e primo");
     }
    
     else {
     System.out.println("O número " + i + " e primo");  
     }
                 }
    if (b < a) {

for (i = b + 1; i < a; i ++) {
    if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
     if (i != 2 && i != 3 && i != 5 && i != 7) {
     System.out.println("O número " + i + " nao e primo");
    }
     else {
     System.out.println("O número " + i + " e primo");  
     
                 }
     

    }
}


    }
    }
    }
}
}






