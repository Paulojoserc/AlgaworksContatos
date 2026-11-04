package br.com.paulocode;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContatosControler {
	
	private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();
	
	static {
		LISTA_CONTATOS.add(new Contato("1", "Maria", "+55 85 0000 0000"));
		LISTA_CONTATOS.add(new Contato("2", "José", "+55 85 0000 0022"));
		LISTA_CONTATOS.add(new Contato("3", "João", "+55 85 0000 2200"));
		LISTA_CONTATOS.add(new Contato("4", "Marta", "+55 85 0000 3500"));
	}
	
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	

}
