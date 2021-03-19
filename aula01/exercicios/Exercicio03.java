package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Double salarioAtual, salarioNovo;

        System.out.println("Digite o salário atual:");

        salarioAtual = entrada.nextDouble();

        salarioNovo = 1.25 * salarioAtual;

        System.out.println("O novo salário é de " + salarioNovo);

        entrada.close();





    }
}
