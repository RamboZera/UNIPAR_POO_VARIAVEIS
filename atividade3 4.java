import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
     
      int primeiroValor = 0;
      int segundoValor = 0;
      int terceiroValor = 0;
      int quartoValor = 0;
     
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Informe o primeiro Valor");
     primeiroValor = scanner.nextInt();
     
    System.out.println("Informe o segundo valor");
    segundoValor = scanner.nextInt();
    
    System.out.println("Informe o terceiro valor");
    terceiroValor = scanner.nextInt();
    
    System.out.println("Informe o quarto valor");
    quartoValor = scanner.nextInt();

    int total = (primeiroValor + segundoValor + terceiroValor + quartoValor) /4;
    
    System.out.println("O total e :" + total );
    }}
