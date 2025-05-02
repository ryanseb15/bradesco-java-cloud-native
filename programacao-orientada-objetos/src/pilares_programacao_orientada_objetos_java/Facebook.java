package pilares_programacao_orientada_objetos_java;

public class Facebook extends ServicoMensagem {
    public void enviarMensagem() {
        validarConexao();
        System.out.println("Enviando mensagem pelo Facebook...");
        salvarHistorico();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook...");
    }
    private void salvarHistorico() {
        System.out.println("Salvando histórico no Facebook...");
    }
}
