public class Produto {

String nome ;
  double preco ;
  int quantidadeEmEstoque ;

public Produto (String nome , double preco , int quantidadeEmEstoque ) {
  this.nome = nome ;
  this.preco = preco ;
  this.quantidadeEmEstoque = quantidadeEmEstoque;
}
  public String getNome () {
    return nome ; 
  }
  public void setNome (String nome ) {
    this.nome ;
  }
  public double getPreco () {
    return preco;
  }
  public void setPreco (double preco){
    this.preco ;
  }
  public int getQuantidadeEmEstoque ( ) {
    return quantidadeEmEstoque ;
  }
  public void setQuantidadeEmEstoque (int quantidadeEmEstoque){
    this.quantidadeEmEstoque ;
  }
  
 public exibirInformacoes () {
  System.out.println("Nome:" + nome ) ;
  System.out.println("Preço:" + preco ) ;
  System.out.println(" Quantidade em Estoque:" + quantidadeEmEstoque);
 }
  
public static void main (String [] args){
  Produto Produto1 = new Produto ("Boneca" , 29.90 , 100 );
  Produto Produto2 = new Produto ( "Espátula" , 15.60 , 50 );

  System.out.println("Produto1:" );
   Produto1.exibirInformacoes();
  System.out.println();

  System.out.println("Produto2:" );
  Produto2.exibirInformacoes();
  System.out.println();
}
}
  
