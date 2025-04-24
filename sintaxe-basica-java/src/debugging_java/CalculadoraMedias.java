package debugging_java;

import java.util.Scanner;

public class CalculadoraMedias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] alunos = {"Ryan", "Rayssa", "Rener"};

        double media = calcularMediaTurma(alunos, scanner);

        System.out.println("A média da turma é: " + media);
    }

    public static double calcularMediaTurma(String[] alunos, Scanner scan) {
        double soma = 0;
        for (String aluno : alunos) {
            System.out.println("Nota do aluno " + aluno);
            double nota = scan.nextInt();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
