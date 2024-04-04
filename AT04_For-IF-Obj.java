public class At4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nmEntre0e100 = 0;
        int nmsEntre101e200 = 0;
        int nmMaioresQue200 = 0;
        
        for (int y = 0; i < 20; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int nm = scanner.nextInt();
            
            if (nm >= 0 && nm <= 100) {
                nmEntre0e100++;
            } else if (nm >= 101 && nm <= 200) {
                nmEntre101e200++;
            } else {
                nmMaioresQue200++;
            }
        }
        
        System.out.println("Quantidade de números entre 0 e 100: " + nmEntre0e100);
        System.out.println("Quantidade de números entre 101 e 200: " + nmEntre101e200);
        System.out.println("Quantidade de números maiores que 200: " + nmMaioresQue200);
        
        scanner.close();
    }
}
