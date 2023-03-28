package Pratica2;

public class Estoque 
{   	
    	private String nome; // ATRIBUTOS 
    	private int qntAtual, qntMinimo;
    	private String mostrar;
    	private boolean precisaRepor;
    	
	public Estoque() // CONTRUTOR SEM PARAMETRODS 
	{	
		this.nome = nome;
		this.qntAtual = qntAtual;
		this.qntMinimo = qntMinimo;
	}
	
	public Estoque(String nome, int qntAtual, int qntMinimo) // CONSTRUTOR COM PARAMETROS
	{
		this.nome = nome;
		this.qntAtual = qntAtual;
		this.qntMinimo = qntMinimo;
	}
	
	 public void darBaixa(int qnt) 
	 {
		 if(qntAtual >= qnt)
			qntAtual = - qnt;
		 
	 }
	 public void mostrar() 
	 {
		 System.out.println(nome);
		 System.out.println(qntMinimo);
		 System.out.println(qntAtual);
		 
	 }
	 public void precisaRepor(int qnt) 
	 {
		 if (qntAtual<=qntMinimo)
			 precisaRepor = true;
	 }
 }


