package exemplos.exemplo03.exemplo04;


import java.util.Scanner;

public class AppVeiculo {
    public static void main(String[] args) {
        

        Veiculo v1 = new Veiculo("Palio", "FIAT", 20);

        v1.setConsumo(30);

        System.out.println("Consumo: " + v1.getConsumo());


    }
}
