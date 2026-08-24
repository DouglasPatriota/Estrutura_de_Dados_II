import java.util.Scanner;

public class Exercicio3_NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int quantidadePares = 0;
        int somaPares = 0;

        System.out.print("Números pares: ");
        for (int n : numeros) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
                quantidadePares++;
                somaPares += n;
            }
        }

        System.out.println("\nQuantidade de pares: " + quantidadePares);
        System.out.println("Soma dos pares: " + somaPares);
    }
}
