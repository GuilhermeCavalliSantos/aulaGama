public class Placar {

     int golTime1, golTime2;
     String nomeTime1, nomeTime2;

    public Placar(){
        this.golTime1=golTime1;
        this.golTime2=golTime2;
        this.nomeTime1=nomeTime1;
        this.nomeTime2=nomeTime2;
        
    }

    public Placar(String time01, String time02){
        nomeTime1 = time01;
        nomeTime2 = time02;
        golTime1 = 0;
        golTime2 = 0;
    }

    public Placar(int golTime1, int golTime2, String nomeTime1, String nomeTime2){
        this.golTime1=golTime1;
        this.golTime2=golTime2;
        this.nomeTime1=nomeTime1;
        this.nomeTime2=nomeTime2;
    }

    public void exibir(){
        System.out.println(nomeTime1+ " " + golTime1 + " X " + golTime2 + " " + nomeTime2);


    }

}


