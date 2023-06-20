package Trabalho;

import java.util.*;

class Usuario 
{
    private String nome;
    private String email;
    private String senha;
    private List<Usuario> amigos;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.amigos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public List<Usuario> getAmigos() {
        return amigos;
    }

    public void adicionarAmigo(Usuario amigo) {
        amigos.add(amigo);
    }

    public void removerAmigo(Usuario amigo) {
        amigos.remove(amigo);
    }

	public Usuario get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}





