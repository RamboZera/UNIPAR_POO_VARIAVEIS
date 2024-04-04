public class AT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de anos: ");
        int anos = scanner.nextInt();
        
        System.out.print("Digite o número de meses: ");
        int meses = scanner.nextInt();
        
        System.out.print("Digite o número de dias: ");
        int dias = scanner.nextInt();
        
        int ttlDi = anos * 365 + meses * 30 + dias;
        
        System.out.println("A idade em dias é: " + ttlDi + " dias.");
        
        scanner.close();
    }
}
