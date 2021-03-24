package exemplo01;

/**
 * Funcionario
 */
public class Funcionario {

    protected String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario(){

    }

    public String exibir(){
        return nome + " : " + salario;
    }

    public void aumentoSalario(double percentual){
        salario = (1+percentual)*salario;
    }

    
}