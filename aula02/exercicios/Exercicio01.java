package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numero, resposta;

        System.out.println("Digite um número");

        numero = entrada.nextInt();

        if(numero > 20) {

            resposta = numero/2;

            System.out.println(resposta);

        }


        entrada.close();



    }
}
