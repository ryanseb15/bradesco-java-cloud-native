package estruturas_repeticao_java;

import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("Tocando...");
        } while (tocando());

        System.out.println("Alo!");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(10) == 1;

        if (atendeu) {
            System.out.println("Atendeu!");
        } else {
            System.out.println("Não atendeu.");
        }

        return ! atendeu;
    }
}
