package org.example.q01;

import java.util.Scanner;

public class Marketing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option;

        ServicoMensagem sms = msg -> System.out.println("SMS enviado: " + msg);
        ServicoMensagem email = msg -> System.out.println("E-mail enviado: " + msg);
        ServicoMensagem redesSociais = msg -> System.out.println("Postado nas Redes Sociais: " + msg);
        ServicoMensagem whatsapp = msg -> System.out.println("WhatsApp enviado: " + msg);

        do {
            System.out.println("==========================================================");
            System.out.println("                 Informe a mensagem");
            System.out.println("==========================================================");
            System.out.print("Informe a mensagem : ");
            String mensagem = sc.nextLine();

            System.out.println("==========================================================");
            System.out.println("                Informe por onde irá enviar");
            System.out.println("==========================================================");
            System.out.println("1 - SMS");
            System.out.println("2 - E-mail");
            System.out.println("3 - Postado nas Redes Sociais");
            System.out.println("4 - WhatsApp");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            option = sc.nextInt();
            sc.nextLine();
            System.out.println("==========================================================");
            switch (option) {
                case 0 -> {System.out.println("Encerrando....");}
                case 1 -> sms.enviar(mensagem);
                case 2 -> email.enviar(mensagem);
                case 3 -> redesSociais.enviar(mensagem);
                case 4 -> whatsapp.enviar(mensagem);
                default -> {System.out.println("Opção Invalida");}
            }
        } while (option != 0);
        sc.close();
    }
}
