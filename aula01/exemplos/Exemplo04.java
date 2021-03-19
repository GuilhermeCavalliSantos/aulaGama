package exemplos;
import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int numero;
        System.out.println("Digite um numero:");
      numero = entrada.nextInt();

      System.out.println("Você digitou " + numero);

      entrada.close();
      

    }
}
