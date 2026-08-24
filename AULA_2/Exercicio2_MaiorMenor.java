import java.util.Scanner;

public class Exercicio2_MaiorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int posMaior = 0, posMenor = 0;

        // Percorre o vetor comparando com o maior/menor já encontrados
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numeros[posMaior]) posMaior = i;
            if (numeros[i] < numeros[posMenor]) posMenor = i;
        }

        System.out.println("Maior valor: " + numeros[posMaior] + " (posição " + posMaior + ")");
        System.out.println("Menor valor: " + numeros[posMenor] + " (posição " + posMenor + ")");
    }
}
