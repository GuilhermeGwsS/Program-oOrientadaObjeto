package Pratica2;

import java.util.Scanner;
public class EstoqueMain {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int qnt = 0, qntAtual = 0, qntMinima;
    	
		System.out.println("Insira o nome do produto: ");
    	nome = ler.nextLine();
    	System.out.println("Insira a quantidade atual");
    	qntAtual = ler.nextInt();
	
		Estoque c1 = new Estoque(nome, qnt, qntAtual);
		System.out.println("O nome do produto ");
		nome = ler.next();
		System.out.println("Qual a quantidade deseja retirar do Estoque? ");
		qnt = ler.nextInt();
		
		c1.darBaixa(qnt);
		c1.mostrar();
		c1.precisaRepor(qnt);
				
	}

}