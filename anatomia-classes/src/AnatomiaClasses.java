public class AnatomiaClasses {
    public static void main(String[] args) throws Exception {
        String primeiroNome = "Ryan";
        String segundoNome = "Santos";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Seu nome completo é " + primeiroNome.concat(" ").concat(segundoNome) + ".";
    }
}
