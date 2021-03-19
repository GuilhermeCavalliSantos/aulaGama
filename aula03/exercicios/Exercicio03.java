package exercicios;

import java.util.Scanner;

public class Exercicio03 {
  public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int numero, cont;

      System.out.println("Digite um numero");
      numero = entrada.nextInt();
      cont =1;

      while(cont<=numero){
          if(cont<=numero/2){
            System.out.print(cont +", ");
          }else{
              System.out.print(cont);
          }
            
            cont = 2*cont;

      }

      entrada.close();


  }  
}
