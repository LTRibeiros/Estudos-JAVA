import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Particular
 */
class ClassMetodos {
    public Construtor[] CarregaVetor(Construtor[]Const) {
      for (int i = 0; i < 10; i ++) {
          Const[i] = new Construtor(); 
      }    
    for (int i = 0; i < 10; i ++) {
        
        Const[i].VT1 = Integer.parseInt(JOptionPane.showInputDialog("VT1: "));
}
    for (int i = 0; i < 10; i ++) {
        Const[i].VT2 = Integer.parseInt(JOptionPane.showInputDialog("VT2: "));
    }
    for (int i = 0; i < 10; i ++) {    
        Const[i].VT3 = Integer.parseInt(JOptionPane.showInputDialog("VT3: "));
    }
    return Const;
}
    
    public Construtor[] ClassificaVetor (Construtor[]Const) {
        int aux = 0, aux2 = 0, aux3 = 0;
        
         for (int i = 0; i < 10; i ++) {
            for (int j =(i + 1); j < 10; j ++) {
                
                if (Const[i].VT1 > Const[j].VT1) {
                    aux = Const[i].VT1;
                    Const[i].VT1 = Const[j].VT1;
                    Const[j].VT1 = aux;
}
                    if (Const[i].VT2 > Const[j].VT2) {
                    aux2 = Const[i].VT2;
                    Const[i].VT2 = Const[j].VT2;
                    Const[j].VT2 = aux2;
}
                    if (Const[i].VT3 > Const[j].VT3) {
                    aux3 = Const[i].VT3;
                    Const[i].VT3 = Const[j].VT3;
                    Const[j].VT3 = aux3;
                }
          
         
        
    }
}
       return Const;  
    }

public void MostraVetor(Construtor[]Const) {
    
    for (int i = 0; i < 10; i ++) {
        System.out.print(" " + Const[i].VT1+ " " );
    }
    for (int i = 0; i < 10; i ++) {
        System.out.print(" " + Const[i].VT2+ " " );
    }
    for (int i = 0; i < 10; i ++) {
        System.out.print(" " + Const[i].VT3+ " " );
    }
    
}
}
    
