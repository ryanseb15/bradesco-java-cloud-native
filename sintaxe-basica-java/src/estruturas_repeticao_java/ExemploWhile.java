package estruturas_repeticao_java;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 10;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce no valor de: " + valorDoce + " foi adicionado ao carrinho.");
            mesada -= valorDoce;
        }
        System.err.println("Mesada: " + mesada);
        System.out.println("Ryan gastou toda sua mesada em doces.");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(0.1,5);
    }
}
