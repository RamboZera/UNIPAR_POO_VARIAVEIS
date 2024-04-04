public class CarroAt5 {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double preco;
    
    public Carro(String marca, String modelo, int ano, String cor, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
    }


  public void acelerar() {
        System.out.println("O carro está acelerando.");
    }
  
    public void ligar() {
        System.out.println("O carro está ligado.");
    }
    
    public void desligar() {
        System.out.println("O carro está desligado.");
    }
    
    public void frear() {
        System.out.println("O carro está freando.");
    }
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public int getAno() {
        return ano;
    }
    
    public String getCor() {
        return cor;
    }
    
    public double getPreco() {
        return preco;
    }
  
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
}

public class CarroTeste {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022, "Preto", 150000.00);
        
        meuCarro.ligar();
        meuCarro.acelerar();
        meuCarro.frear();
        meuCarro.desligar();
      
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano: " + meuCarro.getAno());
        System.out.println("Cor: " + meuCarro.getCor());
        System.out.println("Preço: R$" + meuCarro.getPreco());
        
        meuCarro.setPreco(155000.00);
        System.out.println("Novo preço: R$" + meuCarro.getPreco());
    }
}
