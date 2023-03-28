package Pratica3;

public class CarnavalVip extends CarnavalIngresso
{
	private double valorAdicional;
	private double ingressoVip;
	
	public CarnavalVip(double ingresso, double valorAdicional) 
	{
		super(ingresso);
		this.valorAdicional = valorAdicional;
	}
	
	public void imprimir () 
	{
		ingressoVip = valorAdicional + getIngresso();	
	
		setIngresso(ingressoVip);
		
		System.out.println(" Ingresso Vip : " + ingressoVip);
		
	}

}
