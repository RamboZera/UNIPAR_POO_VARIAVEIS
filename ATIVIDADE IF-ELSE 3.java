import java.util.Scanner;

 class Verification {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nomeUsuario = "Andrey";
        String senha = "senha123";

        System.out.println("Nome do usuario: ");
        nomeUsuario= scanner.nextLine();

        System.out.println("Senha: ");
        senha= scanner.nextLine();

        if( nomeUsuario == "Andrey" && senha == "senha123") {
            System.out.println("Login bem sucedido");
        }else{
            System.out.println("Nome de usuario ou senha incorretos");
        }

    }
}
