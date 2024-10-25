class Estatistica {
    int Codigo;
    String Nome;
    int Quantidade;
    
    Estatistica() 
    {
        this(0, "" ,0);
    }
            Estatistica (int CodCidade, String NomeCidade, int QntAcidentes)
    {
        Codigo = CodCidade;
        Nome = NomeCidade;
        Quantidade = QntAcidentes;
    }        
    
}
