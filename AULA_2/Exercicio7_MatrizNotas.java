import java.util.Scanner;

public class Exercicio7_MatrizNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int ALUNOS = 4;
        final int AVALIACOES = 3;
        float[][] notas = new float[ALUNOS][AVALIACOES];

        // Linha = aluno, coluna = avaliação (P1, P2, P3)
        for (int i = 0; i < ALUNOS; i++) {
            for (int j = 0; j < AVALIACOES; j++) {
                System.out.print("Aluno " + (i + 1) + " - P" + (j + 1) + ": ");
                notas[i][j] = sc.nextFloat();
            }
        }

        for (int i = 0; i < ALUNOS; i++) {
            float soma = 0;
            for (int j = 0; j < AVALIACOES; j++) {
                soma += notas[i][j];
            }
            float media = soma / AVALIACOES;
            System.out.printf("Aluno %d - Média: %.2f%n", (i + 1), media);
        }
    }
}
