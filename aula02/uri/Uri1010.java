package uri;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cod1, cod2, qti1, qti2;
        double preco1, preco2, custo;

        cod1 = entrada.nextInt();
        qti1 = entrada.nextInt();
        preco1 = entrada.nextDouble();
        cod2 = entrada.nextInt();
        qti2 = entrada.nextInt();
        preco2 = entrada.nextDouble();

        custo = (qti1 * preco1) + (qti2 * preco2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", custo);

        entrada.close();


        


    }
}
