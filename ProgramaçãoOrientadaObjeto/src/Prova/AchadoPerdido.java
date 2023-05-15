package Prova;

import javax.swing.JOptionPane;

public class AchadoPerdido {
    private String titulo;
    private String descricao;
    private String local_achado;
    private String foto;
    private String tipo;
    private boolean status;

    public AchadoPerdido(String titulo, String descricao, String local_achado, String foto, String tipo, boolean status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.local_achado = local_achado;
        this.foto = foto;
        this.tipo = tipo;
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal_achado() {
        return local_achado;
    }

    public void setLocal_achado(String local_achado) {
        this.local_achado = local_achado;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String buscarTitulo(String titulo) {
        if (this.titulo.equals(titulo)) {
            return "Titulo: " + this.titulo + "\nDescricao: " + this.descricao + "\nLocal Achado: " + this.local_achado;
        } else {
            return "Não encontrado";
        }
    }

    public void visualizaDetalhes() {
        System.out.println("Titulo: " + this.titulo + "\nFoto: " + this.foto + "\nLocal Achado: " + this.local_achado + "\nTipo: " + this.tipo + "\nStatus: " + this.status);
    }



    public static void main(String[] args) {
        AchadoPerdido objeto = new AchadoPerdido("Chave", "Chave de casa", "Rua 1", "foto1.jpg", "Objeto", true);

        objeto.setDescricao("Chave de casa do tipo tetra");
        objeto.setFoto("foto2.jpg");
        objeto.setTipo("Objeto Pessoal");
        objeto.setStatus(false);

        String tituloBusca = JOptionPane.showInputDialog("Digite um título a ser buscado:");
        System.out.println(objeto.buscarTitulo(tituloBusca));

        objeto.visualizaDetalhes();
    }
}