import java.util.GregorianCalendar;

public class PrePago extends Assinante {
    private Recarga recargas[];
    private int numRecargas;
    private float creditos;

    public PrePago(String cpf, String nome, String celularAssinante) {
        super(cpf, nome, celularAssinante);
    }

    public void recarregar(GregorianCalendar data, float valor) {
        if (numRecargas >= recargas.length) {
            System.out.println("RECARGA NÃO REALIZADA, LIMITE MÁXIMO ALCANÇADO");
            return;
        }

        Recarga recarga = new Recarga(data, valor);
        recargas[numRecargas] = recarga;
        numRecargas++;
        creditos += valor;
        System.out.println("RECARREGADO");
    }

    public void fazerChamada(GregorianCalendar data, int duracao) {
        if (super.totalchamadas > chamadas.length) {
            System.out.println("Não há espaço disponível para realizar a chamada!");
            return;
        }
        ;

        if (creditos >= (duracao * 1.45)) {
            super.chamadas[super.totalchamadas] = new Chamada(data, duracao);
            this.creditos -= (duracao * 1.45);
            super.totalchamadas++;
            System.out.println("Chamada realizada!");
        } else {
            System.out.println("Não foi possível realizar a chamada, creditos insuficientes!");
        }
    };

    public void imprimirFatura(int mes) {
        double custoTotal = 0D;
        float valorTotalRecargas = 0F;
        System.out.println(super.toString());

        for (int i = 0; i < super.totalchamadas; i++) {
            Chamada chamada = chamadas[i];
            if (chamada.getData().get(GregorianCalendar.MONTH) + 1 == mes) {
                double custo = (chamada.getDuracao() * 1.45);
                custoTotal += custo;

                System.out.println("Data: " + chamada.getData());
                System.out.println("Duração: " + chamada.getDuracao() + " minutos");
                System.out.println("Valor: " + custo + " reais");
            }
        }

        for (int i = 0; i < numRecargas; i++) {
            Recarga recarga = recargas[i];
            if (recarga.getData().get(GregorianCalendar.MONTH) + 1 == mes) {
                valorTotalRecargas += recarga.getValor();

                System.out.println("Data: " + recarga.getData());
                System.out.println("Valor: " + recarga.getValor() + " reais");
            }
        }

        System.out.println("Custo total das ligações: " + custoTotal);
        System.out.println("Valor total das recargas: " + valorTotalRecargas);
        System.out.println("Seus créditos: " + creditos);
    };
}