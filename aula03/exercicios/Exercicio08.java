package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int  cont, par;
        double impar, mediaPar, numero ;
        impar = 0;
        par = 0;
        mediaPar =0;

        for (cont = 1; cont <= 10; cont++) {
            System.out.println("Digite o " + cont + "º numero");
            numero = entrada.nextDouble();

            if (numero % 2 == 0) {
                par = par + 1;
                if (par == 1) {
                    mediaPar = numero;
                } else {
                    mediaPar = (numero + mediaPar);
                }

            } else {
                impar = impar + 1;

            }
        }
        System.out.println("A média de pares é: " + (mediaPar/par));
        System.out.println("O percentual de impares é: " + impar / 10);

        entrada.close();

    }

}