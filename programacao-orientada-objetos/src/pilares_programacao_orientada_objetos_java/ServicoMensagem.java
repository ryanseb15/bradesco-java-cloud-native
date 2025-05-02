package pilares_programacao_orientada_objetos_java;

public abstract class ServicoMensagem {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    protected void validarConexao() {
        System.out.println("Validando conexão no MSN...");
    }
}
