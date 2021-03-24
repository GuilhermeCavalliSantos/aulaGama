package exercicios.exercicioContas;


import java.util.HashMap;

public class GerenciaContas_old {

    private HashMap<Integer, Conta> hashContas;

    public GerenciaContas_old() {
        hashContas = new HashMap<>();
    }

    public void novaContaCorrente(int numeroConta, double valorConta) {
        hashContas.put(numeroConta, new ContaCorrente(numeroConta, valorConta));

    }

    public void novaContaEspecial(int numeroConta, double valorConta, double limite) {
        hashContas.put(numeroConta, new ContaEspecial(numeroConta, valorConta, limite));

    }

    public void novaContaPoupanca(int numeroConta, double valorConta) {
        hashContas.put(numeroConta, new ContaPoupanca(numeroConta, valorConta));

    }

    public String depositar(int numeroConta, double deposito) {
        Conta contaEncontrada = hashContas.get(numeroConta);
        if (contaEncontrada != null) {
            contaEncontrada.deposito(deposito);
            return contaEncontrada.getDados();
        } else {
            return "Conta não encontrada";
        }
    }

    public String saque(int numeroConta, double saque) {
        Conta contaEncontrada = hashContas.get(numeroConta);
        if(contaEncontrada != null){
                contaEncontrada.saque(saque);
                return contaEncontrada.getDados();
            }else{
        
        return "Conta não encontrada";
            }
    }

    public String consultarConta(int numeroConta) {
        Conta contaEncontrada = hashContas.get(numeroConta);
        if(contaEncontrada != null){
                return contaEncontrada.getDados();
            }else{
        return "Conta não encontrada";
    }
}
}
