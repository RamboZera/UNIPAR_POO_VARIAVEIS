import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoEstoque {

    public static void main(String[] args) {
        // Lista para armazenar os produtos
        ArrayList<Produto> estoque = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.println("\n=== Menu de Gerenciamento de Estoque ===");
            System.out.println("1. Adicionar um novo produto");
            System.out.println("2. Atualizar o preço ou quantidade de um produto existente");
            System.out.println("3. Exibir detalhes de um produto específico");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                   
                    System.out.println("\nAdicionar um novo produto");
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço do produto: R$");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade em estoque: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine(); 

                    Produto novoProduto = new Produto(nome, preco, quantidade);
                    estoque.add(novoProduto);
                    System.out.println("\nProduto adicionado com sucesso!");
                    break;

                case 2:
                
                    System.out.println("\nAtualizar preço ou quantidade de um produto existente");
                    System.out.print("Nome do produto: ");
                    String produtoNome = scanner.nextLine();

                    Produto produtoAtualizar = null;
                    for (Produto produto : estoque) {
                        if (produto.getNome().equalsIgnoreCase(produtoNome)) {
                            produtoAtualizar = produto;
                            break;
                        }
                    }

                    if (produtoAtualizar != null) {
                        System.out.println("\nProduto encontrado!");
                        System.out.println("1. Atualizar preço");
                        System.out.println("2. Atualizar quantidade em estoque");
                        System.out.print("Escolha uma opção: ");

                        int escolha = scanner.nextInt();
                        scanner.nextLine(); 

                        if (escolha == 1) {
                            System.out.print("\nNovo preço: R$");
                            double novoPreco = scanner.nextDouble();
                            scanner.nextLine(); 
                            produtoAtualizar.setPreco(novoPreco);
                            System.out.println("\nPreço atualizado com sucesso!");
                        } else if (escolha == 2) {
                            System.out.print("\nNova quantidade em estoque: ");
                            int novaQuantidade = scanner.nextInt();
                            scanner.nextLine(); 
                            produtoAtualizar.setQuantidadeEstoque(novaQuantidade);
                            System.out.println("\nQuantidade atualizada com sucesso!");
                        }
                    } else {
                        System.out.println("\nProduto não encontrado.");
                    }
                    break;

                case 3:
               
                    System.out.println("\nExibir detalhes de um produto específico");
                    System.out.print("Nome do produto: ");
                    String nomeProduto = scanner.nextLine();

                    Produto produtoProcurar = null;
                    for (Produto produto : estoque) {
                        if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                            produtoProcurar = produto;
                            break;
                        }
                    }

                    if (produtoProcurar != null) {
                        produtoProcurar.exibirInformacoes();
                    } else {
                        System.out.println("\nProduto não encontrado.");
                    }
                    break;

                case 4:
                    
                    System.out.println("\nSaindo do programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        }
    }
}
