package aprendendo_sintaxe_java.metodos;

public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligarTV() {
        ligada = true;
        System.out.println("Ligando a SmartTV.");
    }

    public void desligarTV() {
        ligada = false;
        System.out.println("Desligando a SmartTV.");
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Aumentando para o canal: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Diminuindo para o canal: " + canal);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Mundando para o canal: " + canal);
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando para o volume: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo para o volume: " + volume);
    }

    public void mostrarStatus() {
        if (ligada == true) {
            System.out.println("A SmartTV está ligada.");
            System.out.println("Canal atual: " + canal);
            System.out.println("Volume atual: " + volume);
        } else {
            System.out.println("A SmartTV está desligada.");
        }
    }
}
