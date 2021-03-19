package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, numero3;
        int menorNumero;

        System.out.println("Digite o primeiro numero:");
        numero1 = entrada.nextInt();
        System.out.println("Digite o segundo nuemro:");
        numero2 = entrada.nextInt();
        System.out.println("Digite o terceiro numero:");
        numero3 = entrada.nextInt();

        menorNumero = MenorNumero(numero1, numero2, numero3);
        System.out.println("O menor numero é " + menorNumero);

        entrada.close();


    }


    static int MenorNumero (int a, int b, int c){
        if(a<b && a<c){
            return a;
        }else{
            if(b<a && b<c){
                return b;
            }else{
                return c;
            }
        }
    }
}
