package Prova;

public class Main {
	    public static void main(String[] args) {
	        Evento evento1 = new Evento("Concerto", "10/06/2023", "20:00", "Teatro Municipal");
	        Ingresso ingresso1 = new Ingresso(evento1, 50.0, 100);
	        
	        VendasSite vendaSite = new VendasSite();
	        vendaSite.setQtdeMax(500);
	        vendaSite.insereIngressoVenda(ingresso1);
	        System.out.println( vendaSite.insereIngressoV);
	    }

}
