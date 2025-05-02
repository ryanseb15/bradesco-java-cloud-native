package pilares_programacao_orientada_objetos_java.interface_java;

import pilares_programacao_orientada_objetos_java.interface_java.equipamentos.EquipamentoMultifuncional;
import pilares_programacao_orientada_objetos_java.interface_java.equipamentos.copiadoras.Copiadora;
import pilares_programacao_orientada_objetos_java.interface_java.equipamentos.digitalizadoras.Digitalizadora;
import pilares_programacao_orientada_objetos_java.interface_java.equipamentos.impressoras.Impressora;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Copiadora copiadora = em;
        Digitalizadora digitalizadora = em;
        Impressora impressora = em;

        copiadora.copiar();
        digitalizadora.digitalizar();
        impressora.imprimir();
    }
}
