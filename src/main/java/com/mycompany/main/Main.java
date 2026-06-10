package com.mycompany.main;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Notificacao> notificacoes = new ArrayList<>();

        notificacoes.add(new NotificacaoEmail());
        notificacoes.add(new NotificacaoSms());
        notificacoes.add(new NotificacaoWhatsApp());

        System.out.println("=== MENU DE NOTIFICAÇÃO ===");
        System.out.println("1 - E-mail 📧");
        System.out.println("2 - SMS 📱");
        System.out.println("3 - WhatsApp 💬");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        System.out.print("Digite a mensagem: ");
        String mensagem = scanner.nextLine();

        ServicoNotificacao servico = new ServicoNotificacao();

        switch (opcao) {
            case 1:
                servico.notificarCliente(notificacoes.get(0), mensagem);
                break;

            case 2:
                servico.notificarCliente(notificacoes.get(1), mensagem);
                break;

            case 3:
                servico.notificarCliente(notificacoes.get(2), mensagem);
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}