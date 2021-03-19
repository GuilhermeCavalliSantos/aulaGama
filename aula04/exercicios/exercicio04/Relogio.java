package exercicios.exercicio04;

public class Relogio {

    private int hora, minuto, segundo;

    public Relogio(int hora, int minuto, int segundo){

        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo); 
        System.out.printf("São: %02d:%02d:%02d", hora, minuto, segundo);


    }
    public void setHora(int hora){
        if(hora>=0 && hora<=23){
            this.hora = hora;
        }else{
            System.out.println("Hora não aplica");
        }}


    public void setMinuto(int minuto){
        if(minuto>=0 && minuto<=59){
            this.minuto = minuto;    
        }else{
            System.out.println("Minuto não aplica");
          
        }
    
        
    }

    public void setSegundo(int segundo){
        if(segundo>=0 && segundo<=59){
            this.segundo = segundo;    
        }else{
            System.out.println("Segudo não aplica");       
    }

    
}}
