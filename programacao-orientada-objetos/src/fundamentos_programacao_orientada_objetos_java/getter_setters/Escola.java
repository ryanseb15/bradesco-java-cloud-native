package fundamentos_programacao_orientada_objetos_java.getter_setters;

public class Escola {
    public static void main(String[] args) {
        Aluno Ryan = new Aluno();
        Ryan.setNome("Ryan");
        Ryan.setIdade(20);

        System.out.println("O aluno " + Ryan.getNome() + " tem " + Ryan.getIdade() + " anos.");
    }
}
