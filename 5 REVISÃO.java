class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0.0;
        this.quantidadeEstoque = 0;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = 0;
    }

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
   
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}

public class Principal {
    public static void main(String[] args) {
       
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Criação de produtos usando diferentes construtores:");

        System.out.print("\nDigite o nome do produto (somente nome): ");
        String nome1 = scanner.nextLine();
        Produto produto1 = new Produto(nome1);
        System.out.println("\nProduto criado usando apenas o nome:");
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preço: " + produto1.getPreco());
        System.out.println("Quantidade em Estoque: " + produto1.getQuantidadeEstoque());

        System.out.print("\n\nDigite o nome do produto: ");
        String nome2 = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco2 = scanner.nextDouble();
        scanner.nextLine(); 
        Produto produto2 = new Produto(nome2, preco2);
        System.out.println("\nProduto criado usando nome e preço:");
        System.out.println("Nome: " + produto2.getNome());
        System.out.println("Preço: " + produto2.getPreco());
        System.out.println("Quantidade em Estoque: " + produto2.getQuantidadeEstoque());

        System.out.print("\n\nDigite o nome do produto: ");
        String nome3 = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco3 = scanner.nextDouble();
        System.out.print("Digite a quantidade em estoque do produto: ");
        int quantidadeEstoque3 = scanner.nextInt();
        Produto produto3 = new Produto(nome3, preco3, quantidadeEstoque3);
        System.out.println("\nProduto criado usando nome, preço e quantidade em estoque:");
        System.out.println("Nome: " + produto3.getNome());
        System.out.println("Preço: " + produto3.getPreco());
        System.out.println("Quantidade em Estoque: " + produto3.getQuantidadeEstoque());
    }
}
