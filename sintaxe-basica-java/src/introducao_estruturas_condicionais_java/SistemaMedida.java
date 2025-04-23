package introducao_estruturas_condicionais_java;

public class SistemaMedida {
    public static void main(String[] args) {
        char sigla = 'M';

        if(sigla == 'P')
            System.out.println("Pequeno");
        else if(sigla == 'M')
            System.out.println("Mêdio");
        else if(sigla == 'G')
            System.out.println("Grande");
        else
            System.out.println("Indefinido");

        switch (sigla) {
            case 'P':
                System.out.println("Pequeno");
                break;
            case 'M':
                System.out.println("Mêdio");
                break;
            case 'G':
                System.out.println("Grande");
                break;
            default:
                System.out.println("Indefinido");
                break;
        }
    }
}
