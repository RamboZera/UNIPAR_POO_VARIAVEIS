public class Carro {
  private String modelo;
   private String marca;
   private String cor;
private int ano;

public carro (String modelo , String marca , String cor , int ano ) {

  this.modelo = modelo ;
  this.marca = marca ;
  this.cor = cor ;
  this.ano = ano;
}
  
public String getModelo (){
  return modelo 
    }
public void setModelo (String modelo){
  this.modelo
    }
public String getMarca () {
  return marca ; 
}
  public void setMarca  (String marca ) {
    this.marca ;
  }
  public String getCor () {
    return cor;
  }
public void setCor  (String cor ) {
  this.cor;
}

public exibirInformacoes () {
  System.out.println ("Modelo:" + modelo );
  System.out.println ("Marca:" + marca );
  System.out.println ("Cor:" + cor );
  System.out.println ("Ano: " + ano );
}
   public static void main (String [] args) {
     Carro Carro1 = new Carro ("Impala","Chevrolet","Preto",1967);
     Carro Carro2 = new Carro ("Mustang","Ford","Vermelho",1965);
   

  System.out.printl ("Carro 1:" );
  Carro1.exibirInformacoes();
  System.out.println();

System.out.println ("Carro 2:" );
Carro2.exibirInformacoes ();
System.out.println();
}
}
