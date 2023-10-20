package br.edu.ifpi.poo.notificacoes;


/**
  Classe que implementa a Interface Notificacao,
  logo esta classe obrigatoriamente tem que implementar(definir um comportamento)
  todos os métodos definidos em Notificacao.
 */
public class NotificacaoEmail implements Notificacao {

    // método sobrescrito da Interface Notificacao
    @Override
    public void enviaNotificacao(String tipo, double valor) {
        // corpo/implementação do método
        System.out.println("enviando notificacao por email, " + tipo + ", Valor: " + valor);
    }
}
