package Prova;

import java.util.ArrayList;

public class VendasSite 
{

	    private ArrayList<Ingresso> ingressoEvento;
	    private int qtdeMax;
		public char[] insereIngressoV;
	    
	    public void VendaSite() {
	        ingressoEvento = new ArrayList<>();
	    }
	    
	    public void insereIngressoVenda(Ingresso ingresso) {
	        ingressoEvento.add(ingresso);
	    }
	    
	    public int getQtdeMax() {
	        return qtdeMax;
	    }

	    public void setQtdeMax(int qtdeMax) {
	        this.qtdeMax = qtdeMax;
	    }
	    
	    public boolean validaQtdeIngresso() {
	        return ingressoEvento.size() < qtdeMax;
	    }
	}




