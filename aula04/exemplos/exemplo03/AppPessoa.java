package exemplos.exemplo03;


public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Emerson");
        Pessoa p2 = new Pessoa("Amanda");

        //p.nome = "Emerson" -> precisava antes de usar o construtor
        p.apresentar();

        p2.apresentar();

    }

    
}