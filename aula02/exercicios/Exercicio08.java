package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double ladoa, ladob, ladoc;

        System.out.println("Digite o lado a");
        ladoa = entrada.nextDouble();
        System.out.println("Digite lado b");
        ladob = entrada.nextDouble();
        System.out.println("Digite lado c");
        ladoc = entrada.nextDouble();

        if((ladoa > ladob + ladoc)|| (ladob > ladoc + ladoa) || (ladoc> ladoa + ladob)){
            System.out.println("Não pode formar triangulo");
        }else{
            if((ladoa == ladob) && (ladob ==ladoc)){
                System.out.println("Triangulo equilatero");    
            }else{
                if((ladoa ==ladob) || (ladob==ladoc) || (ladoa == ladoc)){
                    System.out.println("triangulo isosceles");
                }else{
                    System.out.println("triangulo escaleno");
                }
            }
           
        }



            entrada.close();
        


    }
}
