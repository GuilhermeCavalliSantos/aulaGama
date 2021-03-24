package exercicios.exercicio07;

public class AppPetz {

    public static void main(String[] args) {
        
        Proprietario p = new Proprietario("João", 55555);

        Animal c = new Animal("Diana", "vira lata", 2019, p);

        Animal b = new Animal("Lulu", "pitbull", 2014, p);

        System.out.println(c.Imprimir());

    }
    
}
