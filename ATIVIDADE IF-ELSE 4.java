
import java.util.Scanner;

 class Verification {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Informe um número: ");
        numero1= scanner.nextInt();

        System.out.println("Informe outro número: ");
        numero2= scanner.nextInt();

        if( numero1 > numero2 ){
            System.out.println("O maior número é: "+ numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é: "+ numero2);
        }else  {
            System.out.println("Os números são iguais.");
        }

    }
}
