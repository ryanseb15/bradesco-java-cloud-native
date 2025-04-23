package aprendendo_sintaxe_java;

import java.util.Locale;
import java.util.Scanner;

public class TerminalArgumentos {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Seu nome é " + nome + ".");
        System.out.println("Tens " + idade + " anos.");
        System.out.println("Medes " + altura + " metros.");
        System.out.println("Pesas " + peso + " kilos.");
    }
}
