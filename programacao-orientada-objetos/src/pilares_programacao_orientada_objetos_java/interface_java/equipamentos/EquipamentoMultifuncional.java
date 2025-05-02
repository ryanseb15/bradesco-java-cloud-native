package pilares_programacao_orientada_objetos_java.interface_java.equipamentos;

import pilares_programacao_orientada_objetos_java.interface_java.equipamentos.copiadoras.Copiadora;
import pilares_programacao_orientada_objetos_java.interface_java.equipamentos.digitalizadoras.Digitalizadora;
import pilares_programacao_orientada_objetos_java.interface_java.equipamentos.impressoras.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    public void copiar() {
        System.out.println("Copiando pelo Equipamento Multifuncional...");
    }
    public void digitalizar() {
        System.out.println("Digitalizando pelo Equipamento Multifuncional...");
    }
    public void imprimir() {
        System.out.println("Imprimindo pelo Equipamento Multifuncional...");
    }
}
