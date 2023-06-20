package Pratica5;

import java.util.ArrayList;

public class RedeSocial {
    private String dataCriacao;
    private String nomeUsuario;
    private String dataNascimento;
    private String senha;
    private ArrayList<Publicacao> publicacoes = new ArrayList<>();

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    public void inserePublicacao(Publicacao publi) {
        publicacoes.add(publi);
    }

    public void imprimePublicacoes() {
        System.out.println("Total de publica��es: " + Publicacao.getContadorPublicacao());

        for (Publicacao p : publicacoes) {
            System.out.println("Data da publica��o: " + p.getDataPublicacao());
            System.out.println("Texto da publica��o: " + p.getTextoPublicacao());
            System.out.println("Link da m�dia: " + p.getLinkMidia());
            System.out.println("--------------------------------------");
        }
    }
}