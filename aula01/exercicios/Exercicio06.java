package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double pe, polegada, jarda, milha, km;

        System.out.println("Digite o valor em km: ");

        km = entrada.nextDouble();

        milha = km * 0.62137;
        jarda = milha * 1.760;
        pe = jarda * 3;
        polegada = 12 * pe;

        //System.out.println("A correspondência de " + km + " km é de \n " + pe + " pés \n " + polegada + " polegadas \n " + jarda + " jardas \n " + milha + " milhas");

        System.out.printf("A correspondência de   %.2f   km é de \n %.2f pés \n %.2f polegadas \n %.2f jardas \n %.2f milhas", km, pe, polegada,jarda, milha);








        


    }
}
