package uri;

import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, par, impar, positivo, negativo, cont;
        par = 0;
        impar = 0;
        positivo = 0;
        negativo = 0;

        for(cont = 1; cont<=5; cont++){
            numero = entrada.nextInt();
            if(numero>0){
                positivo++;
            }else{
                if(numero<0){
                    negativo++;
                }
            }
            if(numero % 2 ==0){
                par++;
            }else{
                impar++;
            }
        }
        System.out.println(par+" valor(es) par(es)");
        System.out.println(impar+" valor(es) impar(es)");
        System.out.println(positivo+" valor(es) positivo(s)");
        System.out.println(negativo+" valor(es) negativo(s)");

        entrada.close();



    }
}
