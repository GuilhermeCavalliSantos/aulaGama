package uri;

import java.util.Scanner;

/**
 * Uri1004
 */
public class Uri1004 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, prod;

        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();

        prod = numero1 * numero2;

        System.out.println("PROD = " + prod);

        entrada.close();


        



    }
}