package Prova2;

import java.util.ArrayList;

class UsuarioComum extends Pessoa {
    private String cpf;
    private String dataNascimento;

    public UsuarioComum(String nome, String email, String senha, String cpf, String dataNascimento) {
        super(nome, email, senha);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}

