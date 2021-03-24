package exercicios.exercicioContas;

import java.util.ArrayList;

public class GerenciaContas {

    private ArrayList<Conta> listaContas;

    public GerenciaContas() {
        listaContas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta, double valorConta) {
        listaContas.add(new ContaCorrente(numeroConta, valorConta));

    }

    public void novaContaEspecial(int numeroConta, double valorConta, double limite) {
        listaContas.add(new ContaEspecial(numeroConta, valorConta, limite));

    }

    public void novaContaPoupanca(int numeroConta, double valorConta) {
        listaContas.add(new ContaPoupanca(numeroConta, valorConta));

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
