package exemplos.exemplo03.exemplo04;

public class Veiculo {
    
   private String modelo;
   private String marca;
   private double consumo;

  public  void MostrarDados(){
        System.out.println("O modelo do carro é " + modelo + " e a marca do carro é " + marca);
    }

   public double getConsumo(){
        return consumo;
    }
    public void setConsumo(double novoConsumo){
        if(novoConsumo>0){
            consumo=novoConsumo;
        }
    }

    public Veiculo (String modelo, String marca, double consumo){
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    
    }
    
}
