package exemplos;

import javax.print.attribute.standard.NumberOfDocuments;

public class Exemplo03 {
    public static void main(String[] args) {
        int numeroInteiro;
        double numeroDecimal;

    
        numeroDecimal = 5.999;

        numeroInteiro = (int)numeroDecimal; // casting - transformação em outro tipo

        System.out.println(numeroDecimal);
        System.out.println(numeroInteiro);
    }
}
