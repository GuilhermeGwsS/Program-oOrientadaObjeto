package Prova;
import java.util.ArrayList;
public class Ingresso {

	    private Evento evento;
	    private double valor;
	    private int qtdeMax;
	    private String tipoIngresso;
	    
	    public Ingresso(Evento evento, double valor, int qtdeMax) {
	        this.evento = evento;
	        this.valor = valor;
	        this.qtdeMax = qtdeMax;
	    }
	    
	    public Ingresso(String string, double d) {
			// TODO Auto-generated constructor stub
		}

		// Métodos getters e setters para cada atributo
	    public Evento getEvento() {
	        return evento;
	    }

	    public void setEvento(Evento evento) {
	        this.evento = evento;
	    }

	    public double getValor() {
	        return valor;
	    }

	    public void setValor(double valor) {
	        this.valor = valor;
	    }

	    public int getQtdeMax() {
	        return qtdeMax;
	    }

	    public void setQtdeMax(int qtdeMax) {
	        this.qtdeMax = qtdeMax;
	    }

	    public String getTipoIngresso() {
	        return tipoIngresso;
	    }

	    public void setTipoIngresso(String tipoIngresso) {
	        this.tipoIngresso = tipoIngresso;
	    }
	}

