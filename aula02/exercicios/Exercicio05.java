package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

       final String SENHA = "R10p5";
       String senha;
       Scanner entrada = new Scanner(System.in);

       System.out.println("Digite a senha:");
       senha = entrada.nextLine();

       if(senha.equals(SENHA)){
           System.out.println("acesso concedido");
       }else{
           System.out.println("acesso negado");
       }


       entrada.close();
    }
}
