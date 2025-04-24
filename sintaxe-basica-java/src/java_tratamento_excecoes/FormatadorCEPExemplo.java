package java_tratamento_excecoes;

public class FormatadorCEPExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCEP("2836000");
            System.out.println(cepFormatado);
        } catch (CEPInvalidoExecacao e) {
            System.err.println("CEP inválido");
        }
    }

    static String formatarCEP(String cep) throws CEPInvalidoExecacao {
        if (cep.length() != 8) {
            throw new CEPInvalidoExecacao();
        }
        return "28.360-000";
    }
}
