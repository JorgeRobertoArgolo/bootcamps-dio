package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //exercicio1();
        //exercicio2();
        //exercicio3();
        exercicio4();
    }

    /*
    * Exercício 1 :
    *
    * Escreva um código que
    * receba o nome e o ano de nascimento de alguém e
    * imprima na tela a seguinte mensagem:
    * "Olá 'Fulano' você tem 'X' anos"
    * */
    public static void exercicio1 () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu nome :");
        String name = sc.nextLine();
        System.out.println("Informe a sua idade :");
        int age = sc.nextInt();

        System.out.println(String.format("Olá %s você tem %d anos",  name, age));

        sc.close();
    }

    /*
    * Exercício 2
    *
    * Escreva um código que receba o tamanho do lado de um quadrado,
    * calcule sua área e exiba na tela
    * fórmula: área=lado X lado
    * */
    public static void exercicio2 () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tamanho do lado do quadrado: ");
        int side = sc.nextInt();

        int area = side * side;

        System.out.printf("A área de um quadrado com lado de %s unidades de medida é de %s unidades de medida", side, area);

        sc.close();
    }

    /*
     * Exercício 3
     *
     * Escreva um código que receba a base e a altura
     * de um retângulo, calcule sua área e exiba na tela
     * fórmula: área=base X altura
     * */
    public static void exercicio3 () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a base de um retângulo: ");
        double base = sc.nextInt();

        System.out.println("Informe a altura de um retângulo: ");
        double height = sc.nextInt();

        double area = base * height;

        System.out.printf("A área de um Retângulo com base de %.2f unidades de medida e " +
                "com altura de %.2f unidades de medida " +
                "é de %.2f unidades de medida", base, height, area);

        sc.close();
    }

    /*
    * Escreva um código que receba o nome e a idade de
    * 2 pessoas e imprima a diferença de idade entre elas
     * */
    public static void exercicio4 () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu nome :");
        String name = sc.nextLine();
        System.out.println("Informe a sua idade :");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Informe o nome de outra pessoa:");
        String name2 = sc.nextLine();
        System.out.println("Informe a idade de outra pessoa:");
        int age2 = sc.nextInt();
        sc.nextLine();

        if (age > age2) {
            System.out.printf(
                    "%s é mais velho/a e a diferença de idade é de : " + (age - age2) + "\n", name
            );
        } else if (age < age2) {
            System.out.printf(
                    "%s é mais velho/a e a diferença de idade é de : " + (age2 - age) + "\n", name2
            );
        } else {
            System.out.println("Ambos tem a mesma idade");
        }

        sc.close();
    }
}