package exercicios.exercicio07;

public class Animal {

    private String nome;
    private String raça;
    private int anoNascimento;
    private Proprietario proprietario;

    public Animal(String nome, String raça, int anoNascimento, Proprietario proprietario){
        this.nome=nome;
        this.raça=raça;
        this.anoNascimento=anoNascimento;
        this.proprietario = proprietario;
        
    }

    public String Imprimir(){
        return proprietario.exibir() + " Nome: "+ nome + " - raça " + raça + " - ano do nascimento " + anoNascimento + " - proprietario ";  
    }


    
}
