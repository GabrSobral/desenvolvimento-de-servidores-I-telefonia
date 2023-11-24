import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Recarga {
    private GregorianCalendar data;
    private float valor;

    //Método construtor de recarga
    public Recarga(GregorianCalendar data, float valor){
        this.data = data;
        this.valor = valor;
    }

    // getters de Recarga
    public GregorianCalendar getData(){
        return data;
    }

    public float getValor(){
        return valor;
    }

    //Método toString que concatena a resposta com um tipo string
    public String toString(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        String dataGerada = dateFormat.format(data.getTime());
        return "Data: " + dataGerada + "\nValor: " + valor;
    }
}
