package exercicios.exercicio03;

import java.util.Scanner;

public class AppVeiculo {
    public static void main(String[] args) {
        

        Veiculo v1 = new Veiculo("Palio", "FIAT", 20);

        v1.MostrarDados();

        System.out.println("Consumo: " + v1.MostrarConsumo());


    }
}
