package aprendendo_sintaxe_java;

public class TiposVariaveis {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        byte binario = 127;
        short curto = 32767;
        int inteiro = 2147483647;
        long longo = 2147483647;
        float flutuante = 34028;
        double dobro = 1.7976;
        boolean booleano = true;
        char caractere = 'c';
        String nome = "Ryan";

        byte numero = 0;
        short numero2 = numero;
        byte numero3 = (byte) numero2;

        int i = 0;
        i = 1;
        
        final double PI = 3.14;
    }
}
