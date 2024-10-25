import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Particular
 */
public class MainClass {
    public static void main (String arg []){
        
        Estatistica[]est = new Estatistica[10];
        ClassMetodos m = new ClassMetodos();
        
        int opc = 0;
        while (opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastro Estatística \n" + "2 - Consulta por quantidade de acidentes \n" + " 3 - Consulta por estatísticas de acidentes \n" + "4 - Acidentes acima da média das 10 cidades \n" + "9 - Finaliza"));
        
             
            switch(opc) {
                
                case 1: 
                    est = m.CadastroEst(est);
                    break;
            
       
                case 2:
                    m.ConsultaQntd(est);
                    break;
                    
                case 3:
                    m.ConsultaEst(est);
                   break;
                    
                case 4:
                    m.MediaCidade(est);
                    break;
                    
               case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                   System.exit(0);
                  
                    
              
                    
                    
            
        }  
        
    }
}
}
