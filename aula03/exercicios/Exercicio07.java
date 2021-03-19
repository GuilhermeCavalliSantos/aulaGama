package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero, cont, par, impar;
        par = 0;
        impar = 0;

        for (cont = 1; cont <= 10; cont++) {
            System.out.println("Digite o " + cont + "º numero");
            numero = entrada.nextInt();
            if (numero % 2 == 0) {
                par = par + 1;

            } else {
                impar = impar + 1;
            }
        }
        System.out.println("O total de pares é: " + par);
        System.out.println("O total de impares é: " + impar);
        entrada.close();

    }

}