package pilares_programacao_orientada_objetos_java;

public class MSN extends ServicoMensagem {
    public void enviarMensagem() {
        validarConexao();
        System.out.println("Enviando mensagem pelo MSN...");
        salvarHistorico();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN...");
    }

    private void salvarHistorico() {
        System.out.println("Salvando histórico no MSN...");
    }
}
