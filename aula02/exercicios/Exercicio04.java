package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    double salario, prestacao;

    System.out.println("Digite o salario:");
    salario = entrada.nextDouble();
    System.out.println("Digite a prestação:");
    prestacao = entrada.nextDouble();

    if(prestacao > (0.3* salario)){
        System.out.println("Empréstimo negado");
    }else{
        System.out.println("Empréstio concedido");
    }

    entrada.close();



    }
}
