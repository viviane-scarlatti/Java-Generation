package br.org.generation.exerciciosb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.exerciciosb.model.Produto;
import br.org.generation.exerciciosb.model.Usuario;

@RestController
public class Controller {
	
	Produto prod = new Produto(1,"titulo", "detalhes",20.0f, 2, "link");
	Usuario user = new Usuario(1,"vivi", "vivi@vivi.com", "Viviane","123", "perfil");
	
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Seja Bem Vindo";
	}
	
	@GetMapping("/produtos")
	public String getProdutos() {
		return prod.toString();
	}
	
	@GetMapping("/usuario")
	public String getUsuario() {
		return user.toString();
	}
 
}
