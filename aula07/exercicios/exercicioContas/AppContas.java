package exercicios.exercicioContas;


import java.util.Scanner;

public class AppContas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcao;
        int numeroConta;
        double valorConta =0;
        double limite;
        double deposito;
        double saque;
      

        GerenciaContas contas = new GerenciaContas();


        do {
            System.out.println("1- Nova conta corrente");
            System.out.println("2 - nova conta especial");
            System.out.println("3 - nova conta poupança");
            System.out.println("4 - deposito");
            System.out.println("5 - saque");
            System.out.println("6 - consultar saldo");
            System.out.println("7 - sair");
            System.out.print("Opção ==> ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O numero da sua conta é: " + contas.novaContaCorrente(valorConta));
                   
                    break;

                    case 2:
                    System.out.println("Informe o limite da conta...");
                    limite = teclado.nextDouble();
                    System.out.println("O numero da sua conta é " + contas.novaContaEspecial(valorConta, limite));
                    
                    
                    break;

                    case 3:
                    System.out.println("O numero da conta é " + contas.novaContaPoupanca(valorConta));  
                     
                    break;

                    case 4:
                    System.out.println("Insira o numero da conta");
                    numeroConta = teclado.nextInt();
                    System.out.println("Qual o valor de saldo que deseja colocar?");
                    deposito = teclado.nextDouble();
                    System.out.println(contas.depositar(numeroConta, deposito));
  
                    
                    
                    break;

                    case 5:
                    System.out.println("Insira o numero da conta");
                    numeroConta = teclado.nextInt();
                    System.out.println("Qual o valor de saldo que deseja retirar?");
                    saque = teclado.nextDouble();
                    System.out.println(contas.saque(numeroConta, saque));
                        break;


                    case 6:
                    System.out.println("Insira  número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println(contas.consultarConta(numeroConta));
                    break;
                    
			case 7:
                    break;
            
                default:
                System.out.println("Opção inválida");
                    break;
            }

        } while (opcao != 7);

        teclado.close();

    }

}
