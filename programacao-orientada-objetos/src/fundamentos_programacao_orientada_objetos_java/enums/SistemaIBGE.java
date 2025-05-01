package fundamentos_programacao_orientada_objetos_java.enums;

public class SistemaIBGE {
    public static void main(String[] args) {
        for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome() + " - " + e.getCodigo());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.RIO_DE_JANEIRO;
    
        System.out.println(eb.getSigla());
        System.out.println(eb.getNome());
        System.out.println(eb.getCodigo());
        System.out.println(eb.getNomeMaiusculo());
    }
}
