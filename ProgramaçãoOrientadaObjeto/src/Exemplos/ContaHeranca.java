package Exemplos;

public class ContaHeranca 
{
	private int numero;
	private double saldo;
	
	public ContaHeranca(int numero, double saldo) 
	{
		this.numero = numero; // ATRIBUTOS 
		this.saldo = saldo;
	}

	public int getNumero() // GET MOSTRA 
	{
		return numero;
	}

	public void setNumero(int numero) // SET  ALTERA
	{
		this.numero = numero;
	}

	public double getSaldo() // GET 
	{
		return saldo;
	}

	public void setSaldo(double saldo) 
	{
		this.saldo = saldo;
	}
	
	public void sacar(double valor) // METODOS 
	{
		if(valor<= this.saldo) 
		{
			this.saldo = this.saldo - valor;
		}
	}
	
	public void depositar(double valor) // METODOS
	{
		this.saldo = this.saldo + valor;
		
	}
}
