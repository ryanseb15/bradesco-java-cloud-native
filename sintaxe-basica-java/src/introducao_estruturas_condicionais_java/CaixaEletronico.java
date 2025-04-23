package introducao_estruturas_condicionais_java;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25;
        double valorSolicitado = 17;

        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);
        }

        else
            System.out.println("Saldo insuficiente");
    }
}
