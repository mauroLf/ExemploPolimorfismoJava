class Main2 {
  
public class Teste {
    public void fazAlgo() {
          System.out.println("Este é o método da super classe");
    }
}

  public class NovoTeste extends Teste {
    @Override
    public void fazAlgo() {
          System.out.println("Este é o método foi sobrescrito");
      }
  }

  public static void main(String args[]){
      Teste T = new Teste();
      T.fazAlgo(); // Retorna "Este é o método da super classe"

      NovoTeste TN = new NovoTeste();
      TN.fazAlgo(); // Retorna "Este método foi sobrescrito"
  }
}