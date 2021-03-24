package exercicios.exercicioContas;

import java.util.ArrayList;

public class GerenciaContas {

    private ArrayList<Conta> listaContas;
    private GerarNumero gerarNumero;

    public GerenciaContas() {
        listaContas = new ArrayList<>();
        gerarNumero = new GerarNumero();
    }

    public int novaContaCorrente(double valorConta) {
        int numeroConta = gerarNumero.proximo();
        listaContas.add(new ContaCorrente(numeroConta, valorConta));
        return numeroConta;

    }

    public int novaContaEspecial(double valorConta, double limite) {
        int numeroConta = gerarNumero.proximo();
        listaContas.add(new ContaEspecial(numeroConta, valorConta, limite));
        return numeroConta;

    }

    public int novaContaPoupanca(double valorConta) {
        int numeroConta = gerarNumero.proximo();
        listaContas.add(new ContaPoupanca(numeroConta, valorConta));
        return numeroConta;

    }

    public String depositar(int numeroConta, double deposito) {
        for (Conta numero : listaContas) {
            if (numero.getNumero() == numeroConta) {
                numero.deposito(deposito);
                return numero.getDados();
            }
        }
        return "Conta não encontrada";
    }

    public String saque(int numeroConta, double saque) {
        for (Conta numero : listaContas) {
            if (numero.getNumero() == numeroConta) {
                numero.saque(saque);
                return numero.getDados();
            }
        }
        return "Conta não encontrada";
    }

    public String consultarConta(int numeroConta){
        for (Conta numero : listaContas) {
            if(numero.getNumero() == numeroConta){
        return numero.getDados();
            }
        }   
        return "Conta não encontrada";
    }
}
