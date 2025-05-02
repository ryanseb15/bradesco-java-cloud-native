package pilares_programacao_orientada_objetos_java.pilares_poo;

public class Carro extends Veiculo {
    public void ligar() {
        conferirCambio();
        conferirCombustivel();
        System.out.println("Carro ligado.");
    }
    private void conferirCambio() {
        System.out.println("Conferindo câmbio...");
    }
    private void conferirCombustivel() {
        System.out.println("Conferindo combustível...");
    }
}
