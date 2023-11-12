import java.util.GregorianCalendar;

public class PrePago extends Assinante {
    private Recarga recargas[];
    private float creditos;
    private int numRecargas;

    public PrePago(String cpf, String nome, String celularAssinante) {
        super(cpf, nome, celularAssinante);
    }

    public void recarregar(GregorianCalendar data, float valor) {

    }

    public float fazerChamada(GregorianCalendar data, int duracao) {
        return 0F;
    };

    public void imprimirFatura(int mes) {

    };
}