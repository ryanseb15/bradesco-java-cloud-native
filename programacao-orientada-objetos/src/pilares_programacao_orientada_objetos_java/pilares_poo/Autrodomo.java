package pilares_programacao_orientada_objetos_java.pilares_poo;

public class Autrodomo {
    public static void main(String[] args) {
        Carro fusca = new Carro();
        fusca.setChassi("1");
        fusca.ligar();

        Moto biz = new Moto();
        biz.setChassi("2");
        biz.ligar();

        Veiculo coringa = fusca;
        coringa.ligar();

        coringa = biz;
        coringa.ligar();
    }
}
