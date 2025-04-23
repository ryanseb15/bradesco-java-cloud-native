package aprendendo_sintaxe_java;

public class AnatomiaClasses {
    public static void main(String[] args) {
        String primeiroNome = "Ryan";
        String segundoNome = "Santos";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Meu nome completo é ".concat(primeiroNome).concat(" ").concat(segundoNome);
    }
}
