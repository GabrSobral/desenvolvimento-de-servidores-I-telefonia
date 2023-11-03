public class Assinante{
    //Atributos
    private int CPf;
    private String NomeAssinante;
    private int CelularAssinante;
    
    //coloquei protected para que as outras classes tenham acesso
    protected Chamada[] Chamadas;
    protected int totalChamadas;

    //criando o constructor e inicializando os atributos
    public Assinante(int CPF. String NomeAssinante, int CelularAssinante){
        this.CPF = CPF;
        this.NomeAssinante = NomeAssinante;
        this.CelularAssinante = CelularAssinante;
        this.Chamadas = Chamada[];
        this.totalChamadas = 0;

    }

}