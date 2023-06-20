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
        System.out.println("Total de publicações: " + Publicacao.getContadorPublicacao());

        for (Publicacao p : publicacoes) {
            System.out.println("Data da publicação: " + p.getDataPublicacao());
            System.out.println("Texto da publicação: " + p.getTextoPublicacao());
            System.out.println("Link da mídia: " + p.getLinkMidia());
            System.out.println("--------------------------------------");
        }
    }
}