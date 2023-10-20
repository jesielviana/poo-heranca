package br.edu.ifpi.poo.notificacoes;

/**
  Em Java, uma interface é uma coleção de métodos abstratos (métodos sem implementação)
  que podem ser implementados por classes concretas.
  As interfaces permitem que você defina um conjunto de métodos que uma
  classe deve implementar sem especificar como esses métodos devem ser implementados.

  Isso permite que as classes sejam flexíveis e polimórficas,
  pois várias classes diferentes podem implementar a mesma interface de maneiras diferentes,
  desde que forneçam implementações para todos os métodos definidos na interface.

  Interfaces são usadas para alcançar abstração e
  fornecer um contrato claro para as classes que as implementam.
 */
public interface Notificacao {

    /**
     método definido na Interface, logo todas as classes que implementarem esta Interface
     obrigatoriamente implementarão este método, sendo que cada classe
     poderá definir um comportamento (corpo) específico.
    **/
    public void enviaNotificacao(String tipo, double valor);
}
