package fundamentos_programacao_orientada_objetos_java.enums;

public enum EstadoBrasileiro {
    ESPIRITO_SANTO ("ES", "Espírito Santos", 1),
    RIO_DE_JANEIRO ("RJ", "Rio de Janeiro", 2),
    SAO_PAULO ("SP", "São Paulo", 3),
    MINAS_GERAIS ("MG", "Minas Gerais", 4);

    private String sigla;
    private String nome;
    private int codigo;
    
    private EstadoBrasileiro(String sigla, String nome, int codigo) {
        this.sigla = sigla;
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
