package exemplo01;

public class AppFuncionario {
    public static void main(String[] args) {
        
        Funcionario f = new Funcionario("Amanda", 2000);
        Gerente g = new Gerente("Fernando", 5000, 10);
       // g.nome = "Fernando";

       f.aumentoSalario(0.30);
       g.aumentoSalario(0.20);



        System.out.println(g.exibir());
        System.out.println(f.exibir());

        
    }
    
}
