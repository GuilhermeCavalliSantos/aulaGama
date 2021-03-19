package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double custoFabrica, impostos, custoFinal;

        System.out.println("Qual o custo de fábrica do carro? ");

        custoFabrica = entrada.nextDouble();
        impostos = 0.45 * custoFabrica;

        custoFinal = custoFabrica + (0.28 * custoFabrica) + (impostos);

        

        System.out.println("O custo final é de " + custoFinal + " e os impostos aplicados são de " + impostos);





        entrada.close();

        


    }
}
