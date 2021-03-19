package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Digite a primeira nota");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota");
        nota2 = entrada.nextDouble();

        media = (nota1 * 0.4) + (nota2 * 0.6);

        System.out.printf("%.1f\n", media);

        if (media >= 6.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        entrada.close();

    }
}
