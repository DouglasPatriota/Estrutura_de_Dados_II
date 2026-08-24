import java.util.Scanner;

public class Exercicio4_InverterVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Vetor original: ");
        for (int n : numeros) System.out.print(n + " ");

        // Troca as pontas em direção ao centro, no próprio vetor (sem array auxiliar)
        int inicio = 0, fim = numeros.length - 1;
        while (inicio < fim) {
            int temp = numeros[inicio];
            numeros[inicio] = numeros[fim];
            numeros[fim] = temp;
            inicio++;
            fim--;
        }

        System.out.print("\nVetor invertido: ");
        for (int n : numeros) System.out.print(n + " ");
    }
}
