package exercicio02;

public class Pessoa {
    
    protected String nome;
    protected String telefone;


    public Pessoa(String nome, String telefone){
        this.nome =nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        
        return nome + "- tel: " + telefone;
    }


}
