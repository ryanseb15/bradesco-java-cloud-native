package estruturas_repeticao_java;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"Felipe", "Jonas", "Julis", "Marcos"};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno no índice " + i + " é: " + alunos[i]);
        }

        for (String aluno : alunos) {
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}
