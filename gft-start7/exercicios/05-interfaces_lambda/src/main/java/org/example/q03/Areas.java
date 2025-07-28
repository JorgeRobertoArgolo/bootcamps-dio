package org.example.q03;

import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        FiguraGeometrica figura;
        double resultado;

        do {
            System.out.println("==========================================================");
            System.out.println("                     Calcular área");
            System.out.println("==========================================================");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Círculo");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.print("Informe o lado do quadrado: ");
                    double lado = sc.nextDouble();
                    figura = () -> lado * lado;
                    resultado = figura.calcularArea();
                    System.out.printf("Área do quadrado: %.2f%n", resultado);
                }
                case 2 -> {
                    System.out.print("Informe a base do retângulo: ");
                    double base = sc.nextDouble();
                    System.out.print("Informe a altura do retângulo: ");
                    double altura = sc.nextDouble();
                    figura = () -> base * altura;
                    resultado = figura.calcularArea();
                    System.out.printf("Área do retângulo: %.2f%n", resultado);
                }
                case 3 -> {
                    System.out.print("Informe o raio do círculo: ");
                    double raio = sc.nextDouble();
                    figura = () -> Math.PI * raio * raio;
                    resultado = figura.calcularArea();
                    System.out.printf("Área do círculo: %.2f%n", resultado);
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }

        } while (option != 0);

        sc.close();
    }
}
