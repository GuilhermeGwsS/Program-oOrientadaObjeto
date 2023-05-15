package Exemplos;

public class TesteParametro 
{
	public static void main(AParametro obj)
	{
		obj.setA(10);
		obj.setB(20);
		obj = new AParametro(35, 45, 55);
	}
	
	public static void main(String[] args) 
	{
		AParametro obj1, obj2;
		obj1 = new AParametro(1,2,3);
		obj2 = new AParametro(7,8,9);
		obj1.imprimeValores();
		obj2.imprimeValores();
		main(obj1);
		obj1.imprimeValores();

	}

}