package pilares_programacao_orientada_objetos_java;

public class Telegram extends ServicoMensagem {
    public void enviarMensagem() {
        validarConexao();
        System.out.println("Enviando mensagem pelo Telegram...");
        salvarHistorico();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram...");
    }
    private void salvarHistorico() {
        System.out.println("Salvando histórico no Telegram...");
    }
}
