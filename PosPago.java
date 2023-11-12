import java.util.GregorianCalendar;

public class PosPago extends Assinante {
  private float assinatura;

  public PosPago(String cpf, String nomeAssinante, String celularAssinante, float assinatura) {
    super(cpf, nomeAssinante, celularAssinante);
    this.assinatura = assinatura;
  }

  public void fazerChamada(GregorianCalendar data, int duracao) {
  }

  public void imprimirFatura(int mes) {
  }
}