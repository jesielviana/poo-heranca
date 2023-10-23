package br.edu.ifpi.poo.entidades;

import br.edu.ifpi.poo.notificacoes.Notificacao;

// Herança: a classe ContaPoupanca herda todos os atributos e métodos da classe Conta
public class ContaPoupanca extends Conta{
    public ContaPoupanca(String numero, double abertura, Notificacao notificacao) {
        super(numero, abertura, notificacao);
    }


    // Sobrescrita do método de saque, já que na ContaPoupanca o saque é diferente da Conta normal,
    // visto que na ContaPoupanca é cobrado uma taxa de 10% do valor
    @Override
    public void saque(double valor) {
        super.saque( valor + valor * 0.1);
    }

    @Override
    public void transfere(double valor, Conta destino) {
    // implementar o comportamento da transferencia de ContaPoupanca aqui
    }
}
