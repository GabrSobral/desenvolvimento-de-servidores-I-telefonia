import java.util.Scanner;

public class View {
    public static String[] programOptions = {
        "1 - Cadastrar assinante",
        "2 - Listar assinantes",
        "3 - Fazer chamadas",
        "4 - Fazer recarga",
        "5 - Imprimir faturas",
        "6 - Sair do programa"
    };

    public static void printMenu(String[] options){
        for (String option : options)
            System.out.println(option);

        System.out.print("Choose what you want to do: ");
    }

    public static void clearScreen() {
        try {
            String operatingSystem = System.getProperty("os.name");

            if (operatingSystem.contains("Windows")) {
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            }
            else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static PosPago getPostPaidSubscriberDataByView(Scanner scanner) {
        System.out.print("Digite o CPF do novo assinante: ");
        String newSubscriberCpf = scanner.next();

        System.out.print("Digite o nome do novo assinante: ");
        String newSubscriberName = scanner.next();

        System.out.print("Digite o número de telefone do novo assinante: ");
        String newSubscriberTelephoneNumber = scanner.next();

        System.out.print("Digite o valor da assinatura do novo assinante: ");
        float newSubscriberSubscriptionValue = scanner.nextFloat();

        return new PosPago(
            newSubscriberCpf,
            newSubscriberName,
            newSubscriberTelephoneNumber,
            newSubscriberSubscriptionValue
        );
    }

    public static PrePago getPrePaidSubscriberDataByView(Scanner scanner) {
        System.out.print("Digite o CPF do novo assinante: ");
        String newSubscriberCpf = scanner.next();

        System.out.print("Digite o nome do novo assinante: ");
        String newSubscriberName = scanner.next();

        System.out.print("Digite o número de telefone do novo assinante: ");
        String newSubscriberTelephoneNumber = scanner.next();

        return new PrePago(
            newSubscriberCpf,
            newSubscriberName,
            newSubscriberTelephoneNumber
        );
    }
}
