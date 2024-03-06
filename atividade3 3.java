import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
     
      int primeiroValor = 0;
      int segundoValor = 0;
     
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Informe o primeiro Valor");
     primeiroValor = scanner.nextInt();
     
    System.out.println("Informe o segundo valor");
    segundoValor = scanner.nextInt();

    int total = (primeiroValor + segundoValor) /2;
    
    System.out.println("O total e :" + total );
    }}
