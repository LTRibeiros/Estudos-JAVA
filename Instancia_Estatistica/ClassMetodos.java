import javax.swing.JOptionPane;

class ClassMetodos {
    
    public Estatistica[] CadastroEst(Estatistica[] est) {
        
        for(int i = 0; i < 10; i ++){
            est[i] = new Estatistica();
        }
        
        for(int i = 0; i < 3; i ++){
            est[i].Codigo = Integer.parseInt(JOptionPane.showInputDialog("Código da cidade " + (i + 1)));
            est[i].Nome = JOptionPane.showInputDialog("Nome da cidade" + (i + 1));
            est[i].Quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de acidentes da cidade" + (i + 1)));
        }
        for(int i = 0; i < 10; i ++){
            System.out.print(est[i].Codigo); 
            System.out.print(est[i].Nome);
            System.out.print(est[i].Quantidade); 
            
       
    }
     return est;
    
}
    public Estatistica[] ConsultaQntd(Estatistica[] est) {
        
                
        for (int i = 0; i < 10; i++){
            if (est[i].Quantidade > 100 && est[i].Quantidade < 500){
                System.out.print("Cidades de " + est[i].Nome + " com " + est[i].Quantidade + " de acidentes \n");
            }
        }
        return est;
    }
    
    public Estatistica[] ConsultaEst(Estatistica[] est) {
        int aux;
        String auxNome;
        for(int i = 0; i < 10; i++){
            for(int j = i + 1; j < 10; j++){
                
                if (est[i].Quantidade > est[j].Quantidade) {
                     aux = est[i].Quantidade;
                     est[i].Quantidade = est[j].Quantidade;
                     est[j].Quantidade = aux;
                     
                     
                     auxNome = est[i].Nome;
                     est[i].Nome = est[j].Nome;
                     est[j].Nome = auxNome;
                    
                    
                }
            }
        }
        
        System.out.print("menor numero de acidentes: " + est[0].Quantidade + " na cidade: " + est[0].Nome + "\n maior numero de acidentes: " + est[9].Quantidade + " na cidade: " + est[9].Nome + "\n");
        return est;
    }
        
    public Estatistica[] MediaCidade(Estatistica[] est) {
        
        double media= 0, soma = 0;
        
         for(int i = 0; i < 10; i++){
             soma = est[i].Quantidade + soma;
             media = soma / 10;
         }
         for(int i = 0; i < 10; i++){    
         if (est[i].Quantidade > media) {
             
             System.out.print("A cidade de: " + est[i].Nome + " teve uma média maior, com " + est[i].Quantidade + " acidentes \n");
             
         }
             
         }
        
        
        return est;
    }
}
