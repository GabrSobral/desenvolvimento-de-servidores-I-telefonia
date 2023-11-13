import java.util.Scanner;

public class Telefonia {
    private int numPrePagos;
    private int numPosPagos;

    private PrePago[] prePagos;
    private PosPago[] posPagos;

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

            this.posPagos[numPosPagos] = newPostPaidSubscriber;
            this.numPosPagos++;

            if(numPosPagos == posPagos.length) {
                PosPago[] newPostPaid = new PosPago[posPagos.length + 10];

                for (int i = 0; i < posPagos.length; i++)
                    newPostPaid[i] = posPagos[i];

                posPagos = newPostPaid;
            }
        } else {
            PrePago newPrePaidSubscriber = View.getPrePaidSubscriberDataByView(scanner);

            this.prePagos[numPrePagos] = newPrePaidSubscriber;
            this.numPrePagos++;

            if(numPrePagos == prePagos.length) {
                PrePago[] newPrePaid = new PrePago[prePagos.length + 10];

                for (int i = 0; i < prePagos.length; i++)
                    newPrePaid[i] = prePagos[i];

                prePagos = newPrePaid;
            }
        }
    }

    public void listarAssinantes() {
        System.out.println("--- Pós-pagos ---");

        for (int i = 0; i < this.numPosPagos; i++)
            System.out.println("CPF:" + this.posPagos[i].getcpf());

        System.out.println("--- Pré-pagos ---");

        for (int i = 0; i < this.numPrePagos; i++)
            System.out.println("CPF:" + this.prePagos[i].getcpf());
    }

    public void fazerChamada() {
        Scanner scanner = new Scanner(System.in);

        String[] subscriberOptions = { "1 - Pós-pago", "2 - Pré-pago", };
        View.printMenu(subscriberOptions);
		int subscriberType = scanner.nextInt();

		System.out.println("Digite o CPF do assinante: ");
		String subscriberCpf = scanner.next();

        if(subscriberType == 2) {
            PrePago prePaid = this.localizarPrePago(subscriberCpf);
            
            if(prePaid != null) {
                Chamada call = View.getCallDataByView(scanner);
                
                prePaid.fazerChamada(call.getData(), call.getDuracao());

                System.out.println("Chamada feita com sucesso!");
            } else 
                System.out.println("Assinante pré-pago não encontrado!");
        } else {
            PosPago postPaid = this.localizarPosPago(subscriberCpf);
            
            if(postPaid != null) {
                Chamada call = View.getCallDataByView(scanner);
                
                postPaid.fazerChamada(call.getData(), call.getDuracao());

                System.out.println("Chamada feita com sucesso!");
            } else
                System.out.println("Assinante pós-pago não encontrado!");
        }
    }

    public void fazerRecarga() {
        Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o CPF do assinante: ");
		String subscriberCpf = scanner.next();
        PrePago prePaid = localizarPrePago(subscriberCpf);

        if(prePaid != null) {
            Chamada call = View.getCallDataByView(scanner);
                
            prePaid.recarregar(call.getData(), call.getDuracao());

            System.out.println("Recarga feita com sucesso!");
        } else
            System.out.println("Assinante pré-pago não encontrado!");
    }

    private PrePago localizarPrePago(String cpf) {
        for (int i = 0; i < this.numPrePagos; i++) {
            String currentCpf = this.prePagos[i].getcpf();

			if (currentCpf.compareTo(cpf) == 0)
				return this.prePagos[i];
		}
        
		return null;
    }  

    private PosPago localizarPosPago(String cpf) {

    }

    public void imprimirFaturas() {

    }
}
