package Pratica3;

public class CarnavalNormal extends CarnavalIngresso
{
	private String ingressoNormal;
	

	public CarnavalNormal(double ingresso, String ingressoNormal) 
	{
		super(ingresso);
		this.ingressoNormal = ingressoNormal;
	}

	public void ingressoNormal() 
	{
		System.out.println(" Ingresso Normal");
	}
	
		
	
}