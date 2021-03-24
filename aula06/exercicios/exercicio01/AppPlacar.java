public class AppPlacar {

    public static void main(String[] args) {
        
        Placar p = new Placar();
        p.golTime1 = 2;
        p.golTime2 =3;
        p.nomeTime1= "Palmeiras";
        p.nomeTime2 = "Santos";

    


        p.exibir();


        Placar g = new Placar("Atletico", "Cruzeiro");
        g.exibir();

        Placar z = new Placar(1,7, "Brasil", "Alemanha");

        z.exibir();

    
    
    }
}
