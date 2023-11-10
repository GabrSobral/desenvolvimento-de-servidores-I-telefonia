import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Chamada{
    //atributos
    private GregorianCalendar data;
    private int duracao;

    //constructor
    public Chamada(GregorianCalendar data, int duracao){
        this.data = data;
        this.duracao = duracao;
    }
    //métodos

    //método que retorna a data
    public GregorianCalendar getData(){
        return data;
    }

    //retorna a duração
    public int getDuracao(){
        return duracao;
    }
    
    //cria uma representação visual do atributos
    public String toString(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(data.getTime());
        return "Data: " + formattedDate + "\nDuração: " + duracao + " minutos";
    }
    
}