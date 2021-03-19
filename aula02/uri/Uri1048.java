package uri;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, reajuste, novoSalario; 
        String percentual;

        salario = entrada.nextDouble();

        if(salario>=0 && salario<=400){
            reajuste = 0.15*salario;
            percentual = "15 %";
            novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n", novoSalario); 
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: "+ percentual );
        }else{
            if(salario>400 && salario<=800){
                reajuste = 0.12*salario;
                percentual = "12 %";  
                novoSalario = salario + reajuste;
                System.out.printf("Novo salario: %.2f\n",novoSalario); 
                System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                System.out.println("Em percentual: "+percentual );
            }else{
                if(salario>800 && salario<=1200){
                    reajuste = 0.1 * salario;
                    percentual = "10 %"; 
                    novoSalario = salario + reajuste;
                 System.out.printf("Novo salario: %.2f\n",novoSalario); 
                 System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                 System.out.println("Em percentual: "+ percentual );
                }else{
                    if(salario>1200 && salario<=2000){
                        reajuste = 0.07* salario;
                        percentual = "7 %"; 
                        novoSalario = salario + reajuste;
                         System.out.printf("Novo salario: %.2f\n",novoSalario); 
                        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                         System.out.println("Em percentual: "+percentual ); 
                    }else{
                        reajuste = 0.04*salario;
                        percentual = "4 %";
                        novoSalario = salario + reajuste;
                        System.out.printf("Novo salario: %.2f\n",novoSalario); 
                        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
                        System.out.println("Em percentual: "+percentual );  
                    }
                }
            }
        }

        entrada.close();
                                          
        }
    }
