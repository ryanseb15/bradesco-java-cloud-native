package desafios_codigo;

import java.util.Scanner;

public class SeusPrimeirosIfsJava {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do bruto salário: ");
        double salarioBruto = scanner.nextDouble();
        System.out.println("Digite o valor do adicional dos benefícios: ");
        double adicionalBeneficios = scanner.nextDouble();
        double salarioTransferido = 0;

        if (salarioBruto > 0 && salarioBruto <= 1100.0) {
            salarioTransferido = salarioBruto - salarioBruto * 5/100 + adicionalBeneficios;
        } else if (salarioBruto <= 2500.0) {
            salarioTransferido = salarioBruto - salarioBruto * 10/100 + adicionalBeneficios;
        } else {
            salarioTransferido = salarioBruto - salarioBruto * 15/100 + adicionalBeneficios;
        }

        System.out.printf("O valor do salário a ser transferido é R$ %.2f", salarioTransferido);
    }
}
