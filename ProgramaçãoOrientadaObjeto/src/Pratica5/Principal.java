package Pratica5;
import javax.swing.JOptionPane;

public class Principal 
{
    public static void main(String[] args) 
    {
        String dataCriacao = JOptionPane.showInputDialog("Informe a data de cria��o da rede social: ");
        String nomeUsuario = JOptionPane.showInputDialog("Informe o nome de usu�rio da rede social: ");
        String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento do usu�rio: ");
        String senha = JOptionPane.showInputDialog("Informe a senha da rede social: ");

        RedeSocial redeSocial = new RedeSocial(dataCriacao, nomeUsuario, dataNascimento, senha);

        String dataPublicacao1 = JOptionPane.showInputDialog("Informe a data da primeira publica��o: ");
        String textoPublicacao1 = JOptionPane.showInputDialog("Informe o texto da primeira publica��o: ");
        String linkMidia1 = JOptionPane.showInputDialog("Informe o link da m�dia da primeira publica��o: ");

        Publicacao publicacao1 = new Publicacao(dataPublicacao1, textoPublicacao1, linkMidia1);
        redeSocial.inserePublicacao(publicacao1);

        String dataPublicacao2 = JOptionPane.showInputDialog("Informe a data da segunda publica��o: ");
        String textoPublicacao2 = JOptionPane.showInputDialog("Informe o texto da segunda publica��o: ");
        String linkMidia2 = JOptionPane.showInputDialog("Informe o link da m�dia da segunda publica��o: ");

        Publicacao publicacao;
    }
}
