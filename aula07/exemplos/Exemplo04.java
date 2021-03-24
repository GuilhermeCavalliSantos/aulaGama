package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero;
        String digitado;

        try{
        System.out.println("Digite um valor inteiro: ");
        digitado = entrada.nextLine();
        numero = Integer.parseInt(digitado);
        System.out.println("Voce digitou " + numero);
        } catch(InputMismatchException ex){
        System.out.println("Digitação invalida");
         }catch(NumberFormatException ex){
             System.out.println("numero invalido");
             System.out.println(ex.getMessage());
         }catch(Exception ex){
            System.out.println("Erro Deu ruim...");
            System.out.println(ex.getMessage());

         }finally{
            entrada.close();
         }
         

        

        
    }
    
}
