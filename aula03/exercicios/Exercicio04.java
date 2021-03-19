package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, soma, cont;

        System.out.println("Digite o 1º numero");
        numero = entrada.nextInt();
        soma = 0;
        cont = 2;
        while(numero != 0){

            soma = numero + soma;
            System.out.println("Digite o " + cont + "º número:");
            numero = entrada.nextInt();
            cont++;


        }
        
        System.out.println("A soma dos valores é: " +soma);
        entrada.close();


    }
}
