public class ContaEspecial extends Conta {
    
    private double limiteConta;

    ContaEspecial(int numero, double saldo, double limiteConta){
        super(numero, saldo);
        this.limiteConta = limiteConta;
    }

    public void saque(double saque){
       
        if(getSaldo() + limiteConta >= saque){
            super.saque(saque);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}
