package br.edu.ifpi.poo.notificacoes;

/**
 Classe que implementa a Interface Notificacao,
 logo esta classe obrigatoriamente tem que implementar(definir um comportamento)
 todos os métodos definidos em Notificacao.
 */
public class NotificacaoSMS implements Notificacao{

    @Override
    public void enviaNotificacao(String tipo, double valor) {
        // corpo/implementação do método
        System.out.println("enviando notificacao por SMS, "+ tipo + ", Valor: "+ valor);
    }
}
