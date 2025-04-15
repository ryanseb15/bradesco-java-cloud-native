public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        char caractere = 'M';
        String nome = "Ryan";
        byte bit = 127;
        short curto = 32767;
        int inteiro = 2147483647;
        long longo = 2147483647;
        float flutuante = 2147483647;
        double dobro = 1.7976;

        System.out.println(caractere);
        System.out.println(nome);
        System.out.println(bit);
        System.out.println(curto);
        System.out.println(inteiro);
        System.out.println(longo);
        System.out.println(flutuante);
        System.out.println(dobro);

        byte numeroCurto = 1;
        short numeroNormal = numeroCurto;
        byte convertido = (byte) numeroNormal;

        System.out.println(convertido);
    }
}
