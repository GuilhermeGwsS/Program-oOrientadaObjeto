package Exemplos;

public class ContaPoupancaHeranca extends ContaHeranca
{
	private double rendimento;	

	public ContaPoupancaHeranca(int numero, double saldo, double rendimento) 
	{
		super(numero, saldo);
		this.rendimento = rendimento;
	}

	public double getRendimento() // MOSTRAR
	{
		return rendimento;
	}

	public void setRendimento(double rendimento) // ALTERAR
	{
		this.rendimento = rendimento;
	}
	
	public void atualizaRendimento() 
	{
		double saldoLocal;
		saldoLocal = getSaldo() + (getSaldo()*(this.rendimento/100));
		setSaldo(saldoLocal);
	}
	
	
}
