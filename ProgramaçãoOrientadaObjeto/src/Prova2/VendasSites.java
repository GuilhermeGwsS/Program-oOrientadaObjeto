package Prova2;

import java.util.ArrayList;

import Prova.Ingresso;
public class VendasSites {
	class VendaSite {
	    private int qtdeMax;

	    public VendaSite(int qtdeMax) {
	        this.qtdeMax = qtdeMax;
	    }

	    public boolean validaQtdeIngresso() {
	        // Implemente aqui a l�gica de valida��o da quantidade de ingressos
	        // Verifique se a quantidade atual de ingressos no site � menor que qtdeMax
	        return true; // Exemplo: Sempre retorna verdadeiro para fins de demonstra��o
	    }

	    public void cadastrarIngresso(Ingresso ingresso) {
	        // Implemente aqui a l�gica para cadastrar o ingresso
	    }
	}


}
