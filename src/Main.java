import br.edu.ifpi.poo.entidades.Conta;
import br.edu.ifpi.poo.entidades.ContaCorrente;
import br.edu.ifpi.poo.entidades.ContaPoupanca;
import br.edu.ifpi.poo.notificacoes.NotificacaoEmail;
import br.edu.ifpi.poo.notificacoes.NotificacaoSMS;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        Conta contaCorrente = new ContaCorrente("1", 100, new NotificacaoEmail());
        Conta contaPoupanca = new ContaPoupanca("2", 100, new NotificacaoSMS());

        contas.add(contaCorrente);
        contas.add(contaPoupanca);

        contaPoupanca.saque(10);
        contaCorrente.saque(10);

        contaCorrente.transfere(10, contaPoupanca);

        for (Conta c: contas) {
            System.out.println("Conta "+ c.getNumero() + " - Saldo: "+ c.getSaldo());
        }
    }
}