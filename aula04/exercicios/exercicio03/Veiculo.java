package exercicios.exercicio03;

public class Veiculo {
    
    String modelo;
    String marca;
    double consumo;

    void MostrarDados(){
        System.out.println("O modelo do carro é " + modelo + " e a marca do carro é " + marca);
    }

    double MostrarConsumo(){
        return consumo;
    }

    Veiculo (String modelo, String marca, double consumo){
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    
    }
    
}
