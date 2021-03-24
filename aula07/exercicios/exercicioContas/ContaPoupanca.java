package exercicios.exercicioContas;

public class ContaPoupanca extends Conta{
    
    private static double taxa;

ContaPoupanca(int numero, double saldo){
    super(numero, saldo);
    setTaxa();
}

private void setTaxa() {
    taxa = 0.01*getSaldo();
}

public void saque(double saque){
    if(saque+taxa <=getSaldo()){
        super.saque(saque+taxa);
        setTaxa();
}else{
    System.out.println("Saldo insuficiente");
}

}

@Override
public void deposito(double deposito) {
    super.deposito(deposito);
    setTaxa();
}

public String getDados(){
    return "O numero da conta é " +numero  + " e o saldo é R$ "+ saldo + " e a taxa é " + taxa;
}

}

