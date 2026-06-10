package com.mycompany.main;
public class ServicoNotificacao {

    public void notificarCliente(Notificacao notificacao, String mensagem) {
        notificacao.enviar(mensagem);
    }
}