package Pratica1;

public class EmpregoFaculdade 
{
	public static void main(String[] args) 
	{
		EmpregoFaculdade c1 = new EmpregoFaculdade();
		c1.nome = "Michelle";
		c1.horasAula = 2;
		c1.getGastos();
		c1.getInfo();
	}
	
	
	public String nome;
	public double salario ;
	public int horasAula;
	public double getGastos;
	public double bonus;
	public String getInfo;
	public void getGastos()
	{
	 
	 if(horasAula >= 1) 
	 {
		 salario = 40;	
	 }
	 if(horasAula >=2)
		 bonus = (40 * horasAula)-salario;
	}
	public void getInfo()
	{
		System.out.println("Nome: " + this.nome + ", salario: R$ " + this.salario + " Reais "
				+ "Bonus: R$ " + this.bonus + " Reais ");
	}
	
}


