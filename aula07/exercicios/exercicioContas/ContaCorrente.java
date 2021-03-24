package exercicios.exercicioContas;

public class ContaCorrente extends Conta {
    
    public ContaCorrente(int numero, double saldo){
        super(numero, saldo);
    }


   public void saque(double saque){
       if(saque<=getSaldo()){
           super.saque(saque);

       }else{
           System.out.println("Saldo insuficiente");
       }
   }

   public void deposito(double deposito){
       super.deposito(deposito - 0.10);

   }


   
   


}
