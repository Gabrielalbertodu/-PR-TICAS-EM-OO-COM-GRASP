package com.loja.grasp;

import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarrinhoController controller = new CarrinhoController();

        System.out.println("Bem-vindo ao Sistema de Compras!");
        
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nDigite o nome do produto:");
            String nome = scanner.nextLine();
            
            System.out.println("Digite o preco do produto:");
            double preco = scanner.nextDouble();
            
            System.out.println("Digite a quantidade:");
            int quantidade = scanner.nextInt();
            scanner.nextLine();
            
            Produto produto = new Produto(nome, preco);
            controller.adicionarProdutoAoCarrinho(produto, quantidade);
            
            System.out.println("\nDeseja adicionar mais produtos? (s/n)");
            String resposta = scanner.nextLine();
            continuar = resposta.equalsIgnoreCase("s");
        }
        
        double total = controller.verTotalDoCarrinho();
        System.out.printf("\nValor total do carrinho: R$ %.2f\n", total);
        
        scanner.close();
    }
}
