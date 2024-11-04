import javax.swing.JOptionPane;
import java.io.*;


class ClassMetodos {
    
    public Aluno[] CadastraAluno(Aluno[]x) throws IOException {
        
    
        for (int i = 0 ; i < 3 ; i ++) {
        x[i] = new Aluno();
}
        String FileName = "CadastroAluno.txt";
        BufferedWriter grava = new BufferedWriter(new FileWriter(FileName));
        
        for (int i = 0 ; i < 3 ; i ++) {
            x[i].pnome = JOptionPane.showInputDialog("Primeiro Nome: ");
             grava.write(x[i].pnome);
             grava.newLine();
            x[i].unome = JOptionPane.showInputDialog("Sobrenome: ");
             grava.write(x[i].unome);
             grava.newLine();
            x[i].pontos = Integer.parseInt(JOptionPane.showInputDialog("Nota do aluno:"));
             grava.write(Integer.toString(x[i].pontos));
             grava.newLine();
        }
        grava.close();
        return x;
    }
    
    
    public void MostraCadastro (Aluno[]x) throws IOException {
        
        for (int i = 0 ; i < 3 ; i ++) {
        x[i] = new Aluno();
}
        
        String FileName = "CadastroAluno.txt";
        BufferedReader ler = new BufferedReader (new FileReader(FileName));
        
       for (int i = 0 ; i < 3 ; i ++) {
           
           x[i].pnome = ler.readLine();
           x[i].unome = ler.readLine();
           x[i].pontos = Integer.parseInt(ler.readLine());
           
       }
       for (int i = 0 ; i < 3 ; i ++) {
       System.out.print(x[i].pnome + " "+ x[i].unome + " " +x[i].pontos + "\n");
       
    }
       ler.close();
    }
}
