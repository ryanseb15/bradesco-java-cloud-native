package introducao_estruturas_condicionais_java;

public class PlanoOperadora {
    public static void main(String[] args) {
        char plano = 'M';

        switch (plano) {
            case 'T':
                System.out.println("5Gb Youtube");
            case 'M':
                System.out.println("Whatsapp e Instagram grâtis");
            case 'B':
                System.out.println("100 minutos de ligação");
        }
    }
}
