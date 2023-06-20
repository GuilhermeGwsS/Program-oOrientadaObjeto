package Trabalho;

import java.util.ArrayList;
import java.util.List;

class Sistema 
{
    private List<Usuario> usuarios;
    private Usuario usuarioLogado;

    public Sistema() {
        usuarios = new ArrayList<>();
        usuarioLogado = null;
    }

    public void cadastrarUsuario(String nome, String email, String senha) {
        Usuario novoUsuario = new Usuario(nome, email, senha);
        usuarios.add(novoUsuario);
    }

    public boolean fazerLogin(String email, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                usuarioLogado = usuario;
                return true;
            }
        }
        return false;
    }

    public void fazerLogout() {
        usuarioLogado = null;
    }

    public void incluirAmigo(Usuario amigo) {
        usuarioLogado.adicionarAmigo(amigo);
    }

    public void consultarAmigos() {
        List<Usuario> amigos = usuarioLogado.getAmigos();
        for (Usuario amigo : amigos) {
            System.out.println(amigo.getNome());
        }
    }

    public void excluirAmigo(Usuario amigo) {
        usuarioLogado.removerAmigo(amigo);
    }

    public void enviarMensagem(Usuario amigo, String mensagem) {
        System.out.println("Enviando mensagem para " + amigo.getNome() + ": " + mensagem);
    }

	public Usuario getUsuarioLogado() {
		// TODO Auto-generated method stub
		return null;
	}
}
