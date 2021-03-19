package uri;

import java.util.Scanner;

public class Uri1117 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     
        double notaValida, nota, media, quantidadeValida;
        quantidadeValida = 0;
        notaValida =0;

        while(quantidadeValida <2){
            nota=entrada.nextDouble();
            if(nota>=0 && nota<=10){
                quantidadeValida++;
                notaValida = notaValida + nota;
            }else{

            System.out.println("nota invalida");
            }
        }
        media = notaValida/quantidadeValida;
        System.out.printf("media = %.2f", media);
        entrada.close();






        
    }
}
