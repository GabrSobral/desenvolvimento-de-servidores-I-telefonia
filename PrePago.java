import java.util.GregorianCalendar;

public class PrePago extends Assinante {
    private Recarga recargas[];
    private float creditos;
    private int numRecargas;

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

    public float fazerChamada(GregorianCalendar data, int duracao) {
        return 0F;
    };

    public void imprimirFatura(int mes) {

    };
}