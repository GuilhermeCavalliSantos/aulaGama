package exemplos;

import java.util.HashMap;

public class Exemplo03 {
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "um");
        mapa.put(2, "dois");
        mapa.put(3, "tres");
        mapa.put(4, "quatro");

        System.out.println("3 = " + mapa.get(3));
        System.out.println("3 = " + mapa.get(32));
    }
}
