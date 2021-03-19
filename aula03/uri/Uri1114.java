package uri;

import java.util.Scanner;

public class Uri1114 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        final int SENHA;
        SENHA = 2002;

       numero = entrada.nextInt();

       while(numero != SENHA){
           System.out.println("Senha Invalida");
           numero = entrada.nextInt();
       }

       System.out.println("Acesso Permitido");
       entrada.close();

}
}
