import java.util.Scanner;

public class Telefonia {
    private int numPrePagos;
    private int numPosPagos;

    private PrePago[] prePagos; // change type later
    private PosPago[] posPagos; // change type later

    public Telefonia() {
        this.numPosPagos = 0;
        this.numPrePagos = 0;

        prePagos = new PrePago[10];
        posPagos = new PosPago[10];
    }

    public void cadastrarAssinante() {
        Scanner scanner = new Scanner(System.in);

        String[] registerSubscriberOptions = { "1 - Pós-pago", "2 - Pré-pago", };
        View.printMenu(registerSubscriberOptions);

        int selectedOption = scanner.nextInt();

        if(selectedOption == 1) {
            PosPago newPostPaidSubscriber = View.getPostPaidSubscriberDataByView(scanner);

            posPagos[numPosPagos] = newPostPaidSubscriber;
            numPosPagos++;
        } else {
            PrePago newPrePaidSubscriber = View.getPrePaidSubscriberDataByView(scanner);

            prePagos[numPrePagos] = newPrePaidSubscriber;
            numPrePagos++;
        }
    }

     public void listarAssinantes() {

    }

    public void fazerChamada() {

    }

    public void fazerRecarga() {

    }

    private void localizarPrePago(long cpf) {

    }  

    private void localizarPosPago(long cpf) {

    }

    public void imprimirFaturas() {
        
    }
}
