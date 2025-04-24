package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};

        for (String candidato : candidatos) {
            contatar(candidato);
        }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o(a) candidato(a).");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o(a) candidato(a) com contra proposta.");
        } else {
            System.out.println("Aguardar resultado dos demais candidatos.");
        }
    }

    static void selecionarCandidatos() {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O(A) candidato(a) " + candidato + " pretende receber R$ " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                candidatosSelecionados++;
                System.out.println("O(A) candidato(a) " + candidato + " foi selecionado.");
            }

            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1900, 2100);
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};

        for (String candidato : candidatos) {
            System.out.println("O(A) candidato(a) selecionado(a) foi o(a) " + candidato);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void contatar(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Contato com o(a) canditato(a) " + candidato + " realizado após " + tentativasRealizadas+ " tentativas realizadas.");
        } else {
            System.out.println("Não foi possível contatar o(a) canditato(a) " + candidato + " após " + tentativasRealizadas + " tentativas realizadas.");
        }
    }
}
