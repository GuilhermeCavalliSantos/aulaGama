package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);

        Double salarioMinimo, valorNormal, valorDesconto, valorKw;
        int kW;

        System.out.println("Digite o valor do salário mínimo: ");

        salarioMinimo = entrada.nextDouble();

        System.out.println("Digite o valor da quantidade de quilowatts consumida; ");

        kW = entrada.nextInt();

        valorKw = salarioMinimo/ 500;

        valorNormal = valorKw * kW;

        valorDesconto = valorNormal - (0.15 * valorNormal);

        System.out.println("O valor de cada quilowatt é " + valorKw);
        System.out.println("O valor que a residência deve pagar é " + valorNormal);
        System.out.println("O valor com desconto é " + valorDesconto);









        entrada.close();

    


    }
}
