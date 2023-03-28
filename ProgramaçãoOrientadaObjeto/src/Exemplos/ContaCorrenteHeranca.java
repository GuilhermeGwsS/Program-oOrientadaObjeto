package Exemplos;

public class ContaCorrenteHeranca extends ContaHeranca // (Extends Puxa a Classe Mãe)
{
	private double limite;

	public ContaCorrenteHeranca(int numero, double saldo, double limite) 
	{
		super(numero, saldo);
		this.limite = limite;
	}

	public double getLimite() // GET MOSTRA ou RETORNA
	{
		return limite;
	}

	public void setLimite(double limite) // SET  ALTERA
	{
		this.limite = limite;
	}
	
	public double consultarSadoTotal() 
	{
		return getSaldo() +  getLimite(); // PRECISA DO GET PARA RETORNA DA CLASSE MÃE
	}
	
	
	
}
