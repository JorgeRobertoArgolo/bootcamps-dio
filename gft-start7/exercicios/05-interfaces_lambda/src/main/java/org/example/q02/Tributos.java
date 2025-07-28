package org.example.q02;

import java.util.Scanner;

public class Tributos {
    public static void main(String[] args) {
        Produto alimentacao = preco -> preco * 0.01;
        Produto saudeBemEstar = preco -> preco * 0.015;
        Produto vestuario = preco -> preco * 0.025;
        Produto cultura = preco -> preco * 0.04;

        Scanner sc = new Scanner(System.in);

        int option;
        double preco;

        do {
            System.out.println("==========================================================");
            System.out.println("               Informe o valor do produto");
            System.out.println("==========================================================");
            System.out.print("R$ ");
            preco = sc.nextDouble();
            sc.nextLine();

            System.out.println("==========================================================");
            System.out.println("             Selecione o tipo de produto:");
            System.out.println("==========================================================");
            System.out.println("1 - Alimentação (1%)");
            System.out.println("2 - Saúde e Bem-estar (1.5%)");
            System.out.println("3 - Vestuário (2.5%)");
            System.out.println("4 - Cultura (4%)");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            option = sc.nextInt();
            sc.nextLine();

            System.out.println("==========================================================");

            switch (option) {
                case 1 -> System.out.printf("Imposto sobre Alimentação: R$ %.2f%n", alimentacao.calcularImposto(preco));
                case 2 -> System.out.printf("Imposto sobre Saúde e Bem-estar: R$ %.2f%n", saudeBemEstar.calcularImposto(preco));
                case 3 -> System.out.printf("Imposto sobre Vestuário: R$ %.2f%n", vestuario.calcularImposto(preco));
                case 4 -> System.out.printf("Imposto sobre Cultura: R$ %.2f%n", cultura.calcularImposto(preco));
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }

        } while (option != 0);

        sc.close();
    }
}
