package br.edu.ifpi.poo.entidades;

import br.edu.ifpi.poo.notificacoes.Notificacao;

// Utiliza-se a palavra-chave abstract após antes do class para definir uma classe como abstrata.
// Uma classe abstrata não pode ser instanciada, ou seja,
// ela não permite criar objetos diretamente usando new.
public abstract class Conta {
    // atributo privado, só pode ser acessado/manipulado dentro desta classe.
    private String numero;
    // atributo definido com 'protected', com isso ele é visível nesta classe e classes filhas
    protected double saldo;
    // atributo privado, só pode ser acessado/manipulado dentro desta classe.
    private Notificacao notificacao;

    // construtor da classe
    public Conta(String numero, double abertura, Notificacao notificacao){
        this.numero = numero;
        this.saldo = abertura;
        this.notificacao = notificacao;
    }

    // método saque com implementação padrão
    public void saque(double valor){
        this.saldo -=  valor;
        this.notificacao.enviaNotificacao("saque", valor);
    }

    // método abstrato, definidocom abstract, com essa definição obriga que todas
    // as subclasses desta classe sobscreva/implementem este método.
    public abstract void transferencia(double valor, Conta destino);

    public double getSaldo() {
        return saldo;
    }

    // método que pode ser utilizado para atribuir um novo valor para o atributo notificacao
    public void setNotificacao(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    // método utilizado para consultar o valor do atributo numero
    public String getNumero() {
        return numero;
    }
}
