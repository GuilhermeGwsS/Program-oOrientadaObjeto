package Exemplos;

import java.util.Scanner;
public class Banco 
{
    public static void main(String[] args) 
    {
    	Scanner ler = new Scanner(System.in);
    	
    	String nome, agencia, numConta;
    	double valor;
    	
    	System.out.println("Insira seu nome: ");
    	nome = ler.nextLine();
    	System.out.println("Insira sua agencia: ");
    	agencia = ler.next();
    	System.out.println("Insira o numero de sua conta: ");
    	numConta = ler.next();
    	
    	
    	ContaBancaria c1 = new ContaBancaria(nome, agencia, numConta);
    	System.out.println("deposite um valor para deposito: ");
    	valor = ler.nextDouble();
    	c1.depositar(valor);
    	
    	System.out.println("Saldo atual: " + c1.mostraSaldo());
    	
    	System.out.println("Digite o valor para sacar: ");
    	valor = ler.nextDouble();
    	c1.sacar(valor);
    	
    	System.out.println("Saldo atual: " + c1.mostraSaldo());

    }

}
