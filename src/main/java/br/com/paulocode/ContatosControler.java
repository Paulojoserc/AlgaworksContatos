package br.com.paulocode;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

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

	@GetMapping("/contatos")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("listar");

		modelAndView.addObject("contatos", LISTA_CONTATOS);

		return modelAndView;
	}

	@GetMapping("/contatos/novo")
	public ModelAndView novo() {
		ModelAndView modelAndView = new ModelAndView("formulario");

		modelAndView.addObject("contato",new Contato());

		return modelAndView;

	}

}
