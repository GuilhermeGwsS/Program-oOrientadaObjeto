package Prova2;

import java.util.ArrayList;

	class Promotor extends Pessoa {
	    private String cnpj;

	    public Promotor(String nome, String email, String senha, String cnpj) {
	        super(nome, email, senha);
	        this.cnpj = cnpj;
	    }

	    // Getters e Setters
	    public String getCnpj() {
	        return cnpj;
	    }

	    public void setCnpj(String cnpj) {
	        this.cnpj = cnpj;
	    }
	}

