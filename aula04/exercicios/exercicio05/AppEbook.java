package exercicios.exercicio05;

public class AppEbook {
    public static void main(String[] args) {
      
        Ebook livro = new Ebook("Harry Potter", "JK", 30, 1);

        System.out.println("Você está na pagina "+ livro.exibirPagina());

        livro.avancarPagina();

        livro.avancarPagina();

        System.out.println("Você está na pagina "+ livro.exibirPagina());

        livro.retrocederPagina();

        System.out.println("Você está na pagina "+ livro.exibirPagina());

        livro.irParaPagina(29);

        livro.avancarPagina();

        livro.avancarPagina();

        System.out.println("Você está na pagina "+ livro.exibirPagina());

        livro.irParaPagina(40);

        System.out.println("Você está na pagina "+ livro.exibirPagina());

        livro.mostrarCapa();


    }
    
}
