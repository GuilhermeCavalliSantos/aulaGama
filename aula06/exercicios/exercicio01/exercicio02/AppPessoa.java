package exercicio02;

public class AppPessoa {

    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("João", "333");
        Pessoa e = new Estudante("Matheus", "444", "computação");
        Pessoa r = new Professor("Fabiano", "555" ,5000);

        System.out.println(p);
        System.out.println(e);
        System.out.println(r);

    }
    
}
