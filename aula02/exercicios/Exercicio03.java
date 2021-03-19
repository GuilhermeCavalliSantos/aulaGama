package exercicios;

import java.util.Scanner;

/**
 * Exercicio03
 */
public class Exercicio03 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2;

        System.out.println("Digite o primeiro numero");
        numero1 = entrada.nextDouble();
        System.out.println("Digite o segundo nuemro");
        numero2 = entrada.nextDouble();

        if (numero1 > numero2){
            System.out.println("Ordem decrescente");
            System.out.println(numero1);
            System.out.println(numero2);
        }else{
            System.out.println("Ordem decrescente");
            System.out.println(numero2);
            System.out.println(numero1);
        }

        entrada.close();


    }
    
}