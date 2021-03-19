package exercicios.exercicio05;

public class Ebook {

    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;

    public Ebook(String titulo, String autor, int totalPaginas, int paginaAtual) {
        this.titulo = titulo;
        this.autor = autor;
        setTotalPaginas(totalPaginas);
        //setPaginaAtual(paginaAtual); igual ir para pagina
        irParaPagina(paginaAtual);

    }

    private void setTotalPaginas(int totalPaginas) {
        if (totalPaginas <= 0) {
            System.out.println("Impossível");
        } else {
            this.totalPaginas = totalPaginas;
        }

    }

    //public void setPaginaAtual(int paginaAtual) {             exatamente igual ao irParaPagina
        //if (paginaAtual < 0 || paginaAtual > totalPaginas) {
           // System.out.println("Impossivel ir para esta página");
       // } else {
           // this.paginaAtual = paginaAtual;
       // }
   // }

    public void avancarPagina() {
        if (paginaAtual < totalPaginas) {
            paginaAtual++;
        } else {
            System.out.println("Não é possível avançar");

        }
    }

    public void retrocederPagina() {
        if (paginaAtual == 0) {
            System.out.println("Não é possivel retroceder");
        } else {
            paginaAtual--;
        }

    }

    public void irParaPagina(int paginaNova) {
        if (paginaNova > totalPaginas || paginaNova < 0) {
            System.out.println("Impossivel");
        } else {
            paginaAtual = paginaNova;
        }

    }

    public int exibirPagina() {
        return paginaAtual;
    }

    public void mostrarCapa() {
        System.out.println("O nome do livro é " + titulo + " e o autor é " + autor + ". \nA quantidade de páginas é "
                + totalPaginas);
    }

}
