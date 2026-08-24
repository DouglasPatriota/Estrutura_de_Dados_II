import java.util.Scanner;

public class Exercicio9_StructAluno {

    static class Aluno {
        String nome;
        int idade;
        float nota1, nota2, nota3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = new Aluno();
            System.out.println("--- Aluno " + (i + 1) + " ---");

            System.out.print("Nome: ");
            alunos[i].nome = sc.next();

            System.out.print("Idade: ");
            alunos[i].idade = sc.nextInt();

            System.out.print("Nota 1: ");
            alunos[i].nota1 = sc.nextFloat();

            System.out.print("Nota 2: ");
            alunos[i].nota2 = sc.nextFloat();

            System.out.print("Nota 3: ");
            alunos[i].nota3 = sc.nextFloat();
        }

        int aprovados = 0, reprovados = 0;
        int indiceMaiorMedia = 0;
        float maiorMedia = -1;

        System.out.println("\n--- Resultado ---");
        for (int i = 0; i < alunos.length; i++) {
            float media = (alunos[i].nota1 + alunos[i].nota2 + alunos[i].nota3) / 3;
            String situacao = media >= 7.0f ? "Aprovado" : "Reprovado";
            System.out.printf("%s | Média: %.2f | %s%n", alunos[i].nome, media, situacao);

            if (media >= 7.0f) aprovados++; else reprovados++;
            if (media > maiorMedia) {
                maiorMedia = media;
                indiceMaiorMedia = i;
            }
        }

        System.out.println("\nAprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
        System.out.println("Maior média: " + alunos[indiceMaiorMedia].nome);
    }
}
