package fundamentos_programacao_orientada_objetos_java.construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa Ryan = new Pessoa("Ryan", "123");

        Ryan.setEndereco("Oscar Campos");

        System.out.println("Nome: " + Ryan.getNome());
        System.out.println("CPF: " + Ryan.getCPF());
        System.out.println("Endereço: " + Ryan.getEndereco());
    }
}
