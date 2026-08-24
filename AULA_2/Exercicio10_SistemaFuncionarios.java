import java.util.Scanner;

public class Exercicio10_SistemaFuncionarios {

    static class Funcionario {
        String nome;
        int idade;
        String cargo;
        float salario;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[10];

        // 1. Cadastrar
        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i] = new Funcionario();
            System.out.println("--- Funcionário " + (i + 1) + " ---");

            System.out.print("Nome: ");
            funcionarios[i].nome = sc.next();

            System.out.print("Idade: ");
            funcionarios[i].idade = sc.nextInt();

            System.out.print("Cargo: ");
            funcionarios[i].cargo = sc.next();

            System.out.print("Salário: ");
            funcionarios[i].salario = sc.nextFloat();
        }

        // 2. Listar
        System.out.println("\n--- Funcionários cadastrados ---");
        float somaSalarios = 0;
        int indiceMaiorSalario = 0;

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.printf("%s | %s | %d anos | R$ %.2f%n",
                    funcionarios[i].nome, funcionarios[i].cargo,
                    funcionarios[i].idade, funcionarios[i].salario);

            somaSalarios += funcionarios[i].salario;
            if (funcionarios[i].salario > funcionarios[indiceMaiorSalario].salario) {
                indiceMaiorSalario = i;
            }
        }

        // 3. Maior salário
        System.out.println("\nMaior salário: " + funcionarios[indiceMaiorSalario].nome);

        // 4. Média salarial
        float media = somaSalarios / funcionarios.length;
        System.out.printf("Média salarial: %.2f%n", media);

        // 5. Salários acima da média
        System.out.println("Funcionários acima da média:");
        for (Funcionario f : funcionarios) {
            if (f.salario > media) {
                System.out.printf("- %s (R$ %.2f)%n", f.nome, f.salario);
            }
        }
    }
}
