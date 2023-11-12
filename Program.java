import java.util.Scanner;
import static java.lang.System.exit;

public class Program {
    public static void main(String[] args) {
        Telefonia telefonia = new Telefonia();
        Scanner scanner = new Scanner(System.in);
        int option;
        
        View.clearScreen();
        
        do {
            View.printMenu(View.programOptions);
            
            option = scanner.nextInt();

            try {
                switch (option) {
                    case 1:
                        telefonia.cadastrarAssinante(); break;
                    case 2:
                        telefonia.listarAssinantes(); break;
                    case 3:
                        telefonia.fazerChamada(); break;
                    case 4:
                        telefonia.fazerRecarga(); break;
                    case 5:
                        telefonia.imprimirFaturas(); break;
                    case 6:
                        exit(0);
                    default:
                        System.out.println("Por favor, selecione um número inteiro entre 1 e " + View.programOptions.length);
                }
            } catch (Exception ex) {
                System.out.print(ex);
                exit(0);
            }
        } while(option != 6);

        scanner.close();
    }
}