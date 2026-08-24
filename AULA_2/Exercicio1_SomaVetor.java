import java.util.Scanner;

public class Exercicio1_SomaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

        System.out.print("Números: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        double media = soma / (double) numeros.length;

        System.out.println("\nSoma: " + soma);
        System.out.printf("Média: %.2f%n", media);
    }
}
