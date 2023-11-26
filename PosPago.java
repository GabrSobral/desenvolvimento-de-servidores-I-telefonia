import java.util.GregorianCalendar;

public class PosPago extends Assinante {
  private float assinatura;

  public PosPago(String cpf, String nomeAssinante, String celularAssinante, float assinatura) {
    super(cpf, nomeAssinante, celularAssinante);
    this.assinatura = assinatura;
  }

  public void fazerChamada(GregorianCalendar data, int duracao) {
    if (super.totalchamadas >= chamadas.length) {
      super.chamadas[super.totalchamadas] = new Chamada(data, duracao);
      super.totalchamadas++;
      System.out.println("Chamada realizada!");
    } else {
      System.out.println("Não há espaço disponível para realizar a chamada!");
    }
  }

  public void imprimirFatura(int mes) {
    double custoTotal = 0D;

    System.out.println(super.toString());
    for (int i = 0; i < super.totalchamadas; i++) {
      Chamada chamada = chamadas[i];
      if (chamada.getData().get(GregorianCalendar.MONTH) + 1 == mes) {
        double custo = (chamada.getDuracao() * 1.04);
        custoTotal += custo;

        System.out.println("Data: " + chamada.getData());
        System.out.println("Duração: " + chamada.getDuracao() + " minutos");
      }
    }

    System.out.println("Valor fatura: " + (assinatura + custoTotal));
  }
}