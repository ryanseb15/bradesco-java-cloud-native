package aprendendo_sintaxe_java.metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTV smartvTV = new SmartTV();
        smartvTV.mostrarStatus();
        smartvTV.ligarTV();
        smartvTV.mostrarStatus();
        smartvTV.aumentarVolume();
        smartvTV.diminuirVolume();
        smartvTV.aumentarCanal();
        smartvTV.diminuirCanal();
        smartvTV.mudarCanal(10);
        smartvTV.mostrarStatus();
        smartvTV.desligarTV();
        smartvTV.mostrarStatus();
    }
}
