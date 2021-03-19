package exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

       Scanner entrada = new Scanner(System.in);
        String resposta;
        int n;

        System.out.println("Digite um número:");
        n = entrada.nextInt();

        resposta = teste(n);
        System.out.println(resposta);

        entrada.close();
        

    }

    static String teste (int numero){

        if(numero % 2==0){
            return  "O número é par";
        }else{
            return  "O número é impar";
        }

    

    }

    
}
