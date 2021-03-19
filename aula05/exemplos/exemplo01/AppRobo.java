package exemplo01;

public class AppRobo {
    public static void main(String[] args) {

        Robo robo = new Robo(1, 1, 30, 30);

        robo.norte();
        System.out.println("Posição Y atual: " + robo.getY());
        
    }
}
