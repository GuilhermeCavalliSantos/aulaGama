package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        
        double nota01;
        double nota02;
        double media;

        System.out.println("Insira a primeira nota:");
        nota01 = entrada.nextDouble();

        System.out.println("Insira a segunda nota:");
        nota02 = entrada.nextDouble();

        media = (nota01 + nota02) / 2;

        System.out.println("A média das notas é = " + media);

        entrada.close();
     




    }
}
