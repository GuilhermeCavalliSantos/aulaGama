package uri;

import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int   positivo, cont;
        double soma, numero;
        positivo= 0;
        soma = 0;

        for(cont=1; cont<=6; cont++){
            numero = entrada.nextDouble();
            if(numero > 0){
                positivo = positivo + 1;
                soma = numero + soma;
            }

        }
        System.out.println(positivo + " valores positivos");
        System.out.printf("%.1f\n", soma/(double)positivo);

        entrada.close();


    }
}
