
public class Assinante {
    // Atributos
    private String cpf;
    private String nomeAssinante;
    private String celularAssinante;

    // Coloquei protected para que as outras classes tenham acesso
    protected Chamada[] chamadas;
    protected int totalchamadas;

    // Criando o construtor e inicializando os atributos
    public Assinante(String cpf, String nomeAssinante, String celularAssinante) {
        this.cpf = cpf;
        this.nomeAssinante = nomeAssinante;
        this.celularAssinante = celularAssinante;
        this.chamadas = new Chamada[10]; // Inicializando o array com tamanho 10, pode ser alterado depois
        this.totalchamadas = 0;
    }

    // Métodos
    // Método para retornar o cpf do assinante
    public String getcpf() {
        return cpf;
    }

    // Retorna os dados do assinante
    public String toString() {
        return "Nome: " + nomeAssinante + "\ncpf: " + cpf + "\nCelular: " + celularAssinante + "\nTotal de chamadas: "
                + totalchamadas;
    }
}
