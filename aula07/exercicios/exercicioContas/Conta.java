package exercicios.exercicioContas;

public abstract class Conta {
    
protected int numero;
protected double saldo;

public Conta(int numero, double saldo){
    this.numero= numero;
    this.saldo= saldo;

}

public String getDados(){
    return "O numero da conta é " +numero  + " e o saldo é R$ "+ saldo;
}

public double getSaldo(){
    return saldo;
}

public void deposito(double deposito){
    if(deposito>0){
    saldo = saldo+deposito;
    }
}

public void saque(double saque){
    if(saque>0){
    saldo = saldo - saque;
    }
}

public int getNumero() {
    return numero;
}


}
