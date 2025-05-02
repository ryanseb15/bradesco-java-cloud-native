package pilares_programacao_orientada_objetos_java.pilares_poo;

public abstract class Veiculo {
    private String chassi;

    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public abstract void ligar();
}
