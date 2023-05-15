package Pratica5;
import javax.swing.JOptionPane;

public class Principal 
{
    public static void main(String[] args) 
    {
        String dataCriacao = JOptionPane.showInputDialog("Informe a data de criação da rede social: ");
        String nomeUsuario = JOptionPane.showInputDialog("Informe o nome de usuário da rede social: ");
        String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento do usuário: ");
        String senha = JOptionPane.showInputDialog("Informe a senha da rede social: ");

        RedeSocial redeSocial = new RedeSocial(dataCriacao, nomeUsuario, dataNascimento, senha);

        String dataPublicacao1 = JOptionPane.showInputDialog("Informe a data da primeira publicação: ");
        String textoPublicacao1 = JOptionPane.showInputDialog("Informe o texto da primeira publicação: ");
        String linkMidia1 = JOptionPane.showInputDialog("Informe o link da mídia da primeira publicação: ");

        Publicacao publicacao1 = new Publicacao(dataPublicacao1, textoPublicacao1, linkMidia1);
        redeSocial.inserePublicacao(publicacao1);

        String dataPublicacao2 = JOptionPane.showInputDialog("Informe a data da segunda publicação: ");
        String textoPublicacao2 = JOptionPane.showInputDialog("Informe o texto da segunda publicação: ");
        String linkMidia2 = JOptionPane.showInputDialog("Informe o link da mídia da segunda publicação: ");

        Publicacao publicacao;
    }
}
