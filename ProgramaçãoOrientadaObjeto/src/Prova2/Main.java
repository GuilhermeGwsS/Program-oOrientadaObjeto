package Prova2;

import java.util.ArrayList;

import Prova.Evento;
import Prova.Ingresso;
import Prova2.VendasSites.VendaSite;

public class Main {
	    public static void main(String[] args) {
	        ArrayList<Evento> eventos = new ArrayList<>();
	        ArrayList<Ingresso> ingressos = new ArrayList<>();

	        // Cadastrar Pessoa Física
	        UsuarioComum usuario = new UsuarioComum("João", "joao@gmail.com", "senha123", "1234567890", "01/01/2000");

	        // Cadastrar Promotor
	        Promotor promotor = new Promotor("Empresa XYZ", "contato@empresa.xyz", "senha456", "123456789");

	        // Cadastrar Evento em um ArrayList
	        Evento evento1 = new Evento("Show", "10/06/2023", "Local XYZ", null);
	        Evento evento2 = new Evento("Festival", "15/07/2023", "Local ABC", null);
	        eventos.add(evento1);
	        eventos.add(evento2);

	        // Cadastrar Ingresso em um ArrayList
	        Ingresso ingresso1 = new Ingresso("VIP", 100.0);
	        Ingresso ingresso2 = new Ingresso("CAMAROTE", 200.0);
	        Ingresso ingresso3 = new Ingresso("PISTA", 50.0);
	        ingressos.add(ingresso1);
	        ingressos.add(ingresso2);
	        ingressos.add(ingresso3);

	        // Criar um objeto do tipo VendaSite
	        VendaSite vendaSite = new VendaSite(100);

	        // Cadastrar os ingressos para vender no site
	        if (vendaSite.validaQtdeIngresso()) {
	            for (Ingresso ingresso : ingressos) {
	                vendaSite.cadastrarIngresso(ingresso);
	            }
	        }
	    }	

}

