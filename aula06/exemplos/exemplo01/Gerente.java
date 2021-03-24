package exemplo01;

public class Gerente extends Funcionario {
    
    private int numeroFuncionarios;

    public Gerente(String nome, double salario, int funcionarios){
        super(nome, salario);
        numeroFuncionarios = funcionarios;

    }

    void teste(){
        nome = "Fernando";
    }
    
    @Override
    public String exibir(){
        return super.exibir() + " - " + numeroFuncionarios;
    
    }

    @Override
    public void aumentoSalario(double percentual){
        super.aumentoSalario(percentual+0.2) ;
    }


}
