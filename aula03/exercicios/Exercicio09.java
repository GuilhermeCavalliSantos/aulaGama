package exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        
        Scanner entrada  = new Scanner(System.in);

        double somaTotal, somaTurma, mediaAluno, mediaTurma;
       final int Q_ALUNOS, Q_TURMAS;
        somaTurma = 0;
        Q_ALUNOS = 3;
        somaTotal = 0;
        Q_TURMAS = 2;

        for(int turma = 1; turma<=Q_TURMAS; turma++){
            for (int aluno = 1; aluno <= Q_ALUNOS; aluno++){
                System.out.println("Digite a média do aluno " + aluno + " da turma " + turma);
                mediaAluno = entrada.nextDouble();
                somaTurma = mediaAluno + somaTurma;
            }
            System.out.println("A média da turma " + turma + " é " + somaTurma/Q_ALUNOS);

            mediaTurma = somaTurma/Q_ALUNOS;
            somaTotal= mediaTurma + somaTotal;
            somaTurma = 0;

        }

        System.out.println("A média geral é " + somaTotal/Q_TURMAS);
        entrada.close();


    }
}
