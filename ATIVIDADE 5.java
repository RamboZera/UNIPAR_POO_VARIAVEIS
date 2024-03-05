// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String smartphoneNome = "Smartphone XYZ";
        String smartphoneMarca = "MarcaXYZ";
        double smartphonePreco = 999.99;
        int smartphoneQuantidade = 20;

        String laptopNome = "Laptop ABC";
        String laptopMarca = "MarcaABC";
        double laptopPreco = 1499.99;
        int laptopQuantidade = 15;

        String foneNome = "Fone de Ouvido Bluetooth DEF";
        String foneMarca = "MarcaDEF";
        double fonePreco = 79.99;
        int foneQuantidade = 50;
        
        System.out.println("Smartphone:");
        System.out.println("Nome: " + smartphoneNome);
        System.out.println("Marca: " + smartphoneMarca);
        System.out.println("Preco: $" + smartphonePreco);
        System.out.println("Quantidade em estoque: " + smartphoneQuantidade);
        

        System.out.println("Laptop:");
        System.out.println("Nome: " + laptopNome);
        System.out.println("Marca: " + laptopMarca);
        System.out.println("Preco: $" + laptopPreco);
        System.out.println("Quantidade em estoque: " + laptopQuantidade);
        

        System.out.println("Fone de Ouvido Bluetooth:");
        System.out.println("Nome: " + foneNome);
        System.out.println("Marca: " + foneMarca);
        System.out.println("Preco: $" + fonePreco);
        System.out.println("Quantidade em estoque: " + foneQuantidade);
    }
}
