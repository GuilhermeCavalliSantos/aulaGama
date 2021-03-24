package exercicios.exercicioContas;

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

    public String getDados(){
        return "O numero da conta é " +numero  + " e o saldo é R$ "+ saldo + " e o limite é " + limiteConta;
    }
}
