class Circulo {
    private double raio;
    private String cor;

    // Método construtor
    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    public double getRaio() {
        return raio;
    }

    public String getCor() {
        return cor;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

public class Principal {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Digite a cor do círculo: ");
        String cor = scanner.nextLine();

        Circulo meuCirculo = new Circulo(raio, cor);

        System.out.println("\nCaracterísticas do Círculo:");
        System.out.println("Raio: " + meuCirculo.getRaio());
        System.out.println("Cor: " + meuCirculo.getCor());
        System.out.println("Área: " + meuCirculo.calcularArea());
        System.out.println("Perímetro: " + meuCirculo.calcularPerimetro());
    }
}
