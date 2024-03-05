import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       
        int valor = 0;
        double valorCotacao = 0.0;
       
        System.out.println("Informe o valor para converter");
        valor = scanner.nextInt();
        
        System.out.println("Qual a cotacao");
        valorCotacao = scanner.nextDouble();
        
        double valorConvertido = valor * valorCotacao;
        
        System.out.println("O valor convertido eh " + valorConvertido);
        
        scanner.close();
    }
}
