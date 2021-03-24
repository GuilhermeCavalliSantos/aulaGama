public class ContaPoupanca extends Conta{
    
    private static double taxa;

ContaPoupanca(int numero, double saldo){
    super(numero, saldo);
    taxa = 0.01*getSaldo();
}


public void saque(double saque){
    if(saque+taxa <=getSaldo()){
        super.saque(saque+taxa);
}else{
    System.out.println("Saldo insuficiente");
}

}
}

