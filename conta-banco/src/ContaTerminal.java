import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o nome da conta: ");
        String cliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        String conta = scanner.nextLine();

        double saldo = 1518;
        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
