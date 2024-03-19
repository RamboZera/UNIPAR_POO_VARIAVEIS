import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade = 18;

        System.out.println("Informe sua idade");
        idade = sc.nextInt();

        if( idade > 18){
            System.out.println("Voce é maior de idade");
        }else{
            System.out.println("Voce é menor de idade");
        }

    }
}
