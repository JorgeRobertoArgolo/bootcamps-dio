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
    * Questão 1
    * Escreva um código onde o usuário entra com um número
    * e seja gerada a tabuada de 1 até 10 desse número;
     * */
    public static void exercicio1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        System.out.println("======================== TABUADA ===========================");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = " + num * i + "\n", num, i);
        }
        System.out.println("======================================================");

        sc.close();
    }

    /*
    * Questão 2
    *
    * Escreva um código onde o usuário entra com sua altura e peso,
    * seja feito o calculo do seu IMC(IMC = peso/(altura * altura))
    * e seja exibida a mensagem de acordo com o resultado:
    *
    *  Se for menor ou igual a 18,5 "Abaixo do peso";
    *  se for entre 18,6 e 24,9 "Peso ideal";
    *  Se for entre 25,0 e 29,9 "Levemente acima do peso";
    *  Se for entre 30,0 e 34,9 "Obesidade Grau I";
    *  Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
    *  Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
    * */
    public static void exercicio2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua altura: ");
        double altura = sc.nextDouble();
        sc.nextLine();

        System.out.println("Informe sua peso: ");
        double peso = sc.nextDouble();
        sc.nextLine();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é " + imc);

        if (imc <= 0) {
            System.out.println("Informações inseridas estão incorretas!");
        } else if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade Grau III (Mórbida)");
        }

        sc.close();
    }

    /*
    * Questão 3
    *
    * Escreva um código que o usuário entre com um primeiro número,
    * um segundo número maior que o primeiro e escolhe entre a opção par e impar,
    * com isso o código deve informar todos os números pares ou ímpares
    * (de acordo com a seleção inicial) no intervalo de números informados,
    * incluindo os números informados e em ordem decrescente;
    * */
    public static void exercicio3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        sc.nextLine();

        int num2;
        do {
            System.out.print("Digite o segundo número (maior que o primeiro): ");
            num2 = sc.nextInt();
        } while (num2 <= num1);
        sc.nextLine();

        String escolha;
        do {
            System.out.print("Deseja ver os números pares ou ímpares? (pares/impares): ");
            escolha = sc.nextLine().toLowerCase();
        } while (!escolha.equals("pares") && !escolha.equals("impares"));

        System.out.println("Números " + escolha + " entre " + num1 + " e " + num2 + " em ordem decrescente:");

        for (int i = num2; i >= num1; i--) {
            if (escolha.equals("pares") && i % 2 == 0) {
                System.out.print(i + " ");
            } else if (escolha.equals("impares") && i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }

    /*
    * Questçao 4
    *
    * Escreva um código onde o usuário informa um número inicial, posteriormente
    * irá informar outros N números, a execução do código irá continuar até que
    * o número informado dividido pelo primeiro número tenha resto diferente de 0 na
    * divisão, números menores que o primeiro número devem ser ignorados
    * */
    public static void exercicio4() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número inicial: ");
        int num = sc.nextInt();

        int num2;

        while (true) {
            System.out.print("Digite um número: ");
            num2 = sc.nextInt();

            if (num2 < num) {
                System.out.println("Número inválido, pois é menor que o número inicial.");
                continue;
            }
            if (num2 % num != 0) {
                System.out.println("Número não divisível por " + num);
                break;
            }
            System.out.println("O Número "+ num2 + " é válido");
        }

        sc.close();
    }
}