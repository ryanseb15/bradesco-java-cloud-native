package pilares_programacao_orientada_objetos_java;

public class Usuario {
    public static void main(String[] args) {
        ServicoMensagem sm = null;
        String app = "MSN";

        if (app.equals("MSN")) {
            sm = new MSN();
        } else if(app.equals("Facebook")) {
            sm = new Facebook();
        } else if(app.equals("Telegram")) {
            sm = new Telegram();
        }

        sm.enviarMensagem();
        sm.receberMensagem();
    }
}
