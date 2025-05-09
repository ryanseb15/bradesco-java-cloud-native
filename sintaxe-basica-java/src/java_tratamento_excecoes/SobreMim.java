package java_tratamento_excecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();
    
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();
    
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
    
            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();
    
            System.out.println("Olá! Me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Tenho " + altura + " metro");
        } catch (InputMismatchException e) {
            System.err.println("O campo idade deve ser numérico.");
        }
    }
}
