package Pratica6;

import java.util.ArrayList;

class RedeSocial 
{
	  private String dataCriacao;
	  private String nomeUsuario;
	  private String dataNascimento;
	  private String senha;
	  private ArrayList<Publicacao> publicacoes;

	  public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) 
	  {
	    this.dataCriacao = dataCriacao;
	    this.nomeUsuario = nomeUsuario;
	    this.dataNascimento = dataNascimento;
	    this.senha = senha;
	    this.publicacoes = new ArrayList<>();
	  }

	  public void inserePublicacao(Publicacao publi) {
	    publicacoes.add(publi);
	  }

	  public void imprimePublicacoes() 
	  {
	    System.out.println("Total de publica��es: " + Publicacao.getContadorPublicacao());
	    for (Publicacao publi : publicacoes) 
	    {
	      System.out.println("Data de publica��o: " + publi.getDataPublicacao());
	      System.out.println("Texto da publica��o: " + publi.getTextoPublicacao());
	      System.out.println("Link da m�dia: " + publi.getLinkMidia());
	      System.out.println();
	   }
	 }
}
	