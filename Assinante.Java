public class Assinante {
    //Atributos
    private int CPF;
    private String NomeAssinante;
    private int CelularAssinante;

    //Coloquei protected para que as outras classes tenham acesso
    protected Chamada[] Chamadas;
    protected int totalChamadas;

    //Criando o construtor e inicializando os atributos
    public Assinante(int CPF, String NomeAssinante, int CelularAssinante) {
        this.CPF = CPF;
        this.NomeAssinante = NomeAssinante;
        this.CelularAssinante = CelularAssinante;
        this.Chamadas = new Chamada[10]; //Inicializando o array com tamanho 10, pode ser alterado depois
        this.totalChamadas = 0;
    }

    //Métodos
    //Método para retornar o CPF do assinante
    public int getCPF() {
        return CPF;
    }

    //Retorna os dados do assinante
    public String toString() {
        return "Nome: " + NomeAssinante + "\nCPF: " + CPF + "\nCelular: " + CelularAssinante + "\nTotal de chamadas: " + totalChamadas;
    }
}
