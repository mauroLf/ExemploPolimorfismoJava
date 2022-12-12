public class funcionario
{
  public double CalcularVendas()
  {
        decimal valorUnitario = decimal.MinValue;
        decimal produtosVendidos = decimal.MinValue;
  
        return valorUnitario * produtosVendidos;
  }
}

public class vendedor extends funcionario
{
  @Override
  public double CalcularVendas()
  {
        double valorUnitario = 50;
        double produtosVendidos = 1500;
  
        return valorUnitario * produtosVendidos;
  }
}

public class diretor extends funcionario
{
  @Override
  public decimal CalcularVendas()
  {
      decimal valorUnitario = 150;
      decimal produtosVendidos = 3800;
      decimal taxaAdicional = 100;

      return taxaAdicional + (valorUnitario * produtosVendidos);
  }
}


