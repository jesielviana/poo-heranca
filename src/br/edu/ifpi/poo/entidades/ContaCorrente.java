package br.edu.ifpi.poo.entidades;

import br.edu.ifpi.poo.notificacoes.Notificacao;

// Herança: a classe ContaCorrente herda todos os atributos e métodos da classe Conta
public class ContaCorrente extends Conta{
    /**
     * Como a classe Conta tem um construtor que recebe dois parâmetros (abertura e notificacao),
     * obrigatoriamente esta classe (ContaCorrente) tem que definir um construtor que receba pelo menos
     * os dois parâmetros da classe pai (Conta).
     */
    public ContaCorrente(String numero, double abertura, Notificacao notificacao) {
        // a primeria linha do construtor da classe filha obrigatoriamente deve ser a chamada para o
        // construtor da classe pai usando super()
        super(numero, abertura, notificacao);
    }

    /**
     * A classe Conta (classe pai desta classe) definiu o método transferencia como abstrato,
     * logo todas as classes que herdam de Conta obrigatoriamente devem
     * sobscrever (definir uma implementação) este método.
     */
    @Override
    public void transferencia(double valor, Conta destino) {

    }
}
