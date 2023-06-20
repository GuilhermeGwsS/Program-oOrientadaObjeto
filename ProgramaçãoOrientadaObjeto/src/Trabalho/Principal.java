package Trabalho;

public class Principal 
{
    public static void main(String[] args) 
    {
        Sistema sistema = new Sistema();

        // Cadastrar usu�rios
        sistema.cadastrarUsuario("Usu�rio 1", "usuario1@example.com", "senha1");
        sistema.cadastrarUsuario("Usu�rio 2", "usuario2@example.com", "senha2");
        sistema.cadastrarUsuario("Usu�rio 3", "usuario3@example.com", "senha3");

        // Fazer login
        boolean loginSucesso = sistema.fazerLogin("usuario1@example.com", "senha1");
        if (loginSucesso) {
            System.out.println("Login realizado com sucesso!");
            Usuario usuarioLogado = sistema.getUsuarioLogado();

            // Incluir amigo
            Usuario amigo = sistema.getUsuarioLogado().get(1); // Obter o segundo usu�rio cadastrado
            sistema.incluirAmigo(amigo);

            // Consultar amigos
            System.out.println("Amigos do usu�rio atual:");
            sistema.consultarAmigos();

            // Excluir amigo
            sistema.excluirAmigo(amigo);

            // Enviar mensagem
            String mensagem = "Ol�, amigo!";
            sistema.enviarMensagem(amigo, mensagem);

            // Fazer logout
            sistema.fazerLogout();
        } else {
            System.out.println("Falha no login!");
        }
    }
}