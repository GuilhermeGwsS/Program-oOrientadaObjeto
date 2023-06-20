package Pratica6;

public class Principal 
{
	  public static void main(String[] args) {
	    // Solicitação dos dados da Rede Social
	    String dataCriacao = "2023-05-17";
	    String nomeUsuario = "usuario1";
	    String dataNascimento = "2000-01-01";
	    String senha = "senha123";

	    // Criação do objeto RedeSocial
	    RedeSocial redeSocial = new RedeSocial(dataCriacao, nomeUsuario, dataNascimento, senha);

	    // Solicitação dos dados da primeira publicação
	    String dataPublicacao1 = "2023-05-17";
	    String textoPublicacao1 = "Conteúdo da publicação 1";
	    String linkMidia1 = "https://example.com/midia1";

	    // Criação do objeto Publicacao 1
	    Publicacao publicacao1 = new Publicacao(dataPublicacao1, textoPublicacao1, linkMidia1);

	    // Solicitação dos dados da segunda publicação
	    String dataPublicacao2 = "2023-05-18";
	    String textoPublicacao2 = "Conteúdo da publicação 2";
	    String linkMidia2 = "https://example.com/midia2";

	    // Criação do objeto Publicacao 2
	    Publicacao publicacao2 = new Publicacao(dataPublicacao2, textoPublicacao2, linkMidia2);

	  }
}
	    
