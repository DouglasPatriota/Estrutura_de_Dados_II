import java.util.Scanner;

public class Exercicio8_StructProduto {

    // "Struct" em Java = classe simples agrupando campos de tipos diferentes
    static class Produto {
        String nome;
        int codigo;
        float preco;
        int quantidade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto[] produtos = new Produto[5];

        for (int i = 0; i < produtos.length; i++) {
            produtos[i] = new Produto();
            System.out.println("--- Produto " + (i + 1) + " ---");

            System.out.print("Nome: ");
            produtos[i].nome = sc.next();

            System.out.print("Código: ");
            produtos[i].codigo = sc.nextInt();

            System.out.print("Preço: ");
            produtos[i].preco = sc.nextFloat();

            System.out.print("Quantidade: ");
            produtos[i].quantidade = sc.nextInt();
        }

        int indiceMaiorValor = 0;
        System.out.println("\n--- Produtos cadastrados ---");

        for (int i = 0; i < produtos.length; i++) {
            float valorEstoque = produtos[i].preco * produtos[i].quantidade;
            System.out.printf("%s | código %d | valor em estoque: %.2f%n",
                    produtos[i].nome, produtos[i].codigo, valorEstoque);

            float valorAtualMaior = produtos[indiceMaiorValor].preco * produtos[indiceMaiorValor].quantidade;
            if (valorEstoque > valorAtualMaior) {
                indiceMaiorValor = i;
            }
        }

        System.out.println("\nMaior valor em estoque: " + produtos[indiceMaiorValor].nome);
    }
}
