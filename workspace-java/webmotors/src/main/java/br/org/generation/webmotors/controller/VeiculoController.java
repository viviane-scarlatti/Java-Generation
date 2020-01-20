package br.org.generation.webmotors.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.webmotors.bd.BDVeiculo;
import br.org.generation.webmotors.model.Veiculo;

@RestController
public class VeiculoController {
	
	// "criei" meu banco de dados
	private BDVeiculo bd = new BDVeiculo();
	
	@PostMapping("veiculo/novo")
	public ResponseEntity<Veiculo> novoVeiculo(@RequestBody Veiculo veiculo) {
		bd.gravar(veiculo);
		return ResponseEntity.ok(veiculo);
	}
	
	@GetMapping("/veiculo/{id}")
	public ResponseEntity<Veiculo> getVeiculo(@PathVariable int id) {
		Veiculo vei = bd.buscar(id);
		if (vei != null) {
			return ResponseEntity.ok(vei);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/veiculo/todos")
	public ResponseEntity<ArrayList<Veiculo>> getTodos() {
		return ResponseEntity.ok(bd.buscarTodos());
	}
	
	@PutMapping("/veiculo")
	public ResponseEntity<String> alteraVeiculo(@RequestBody Veiculo veiculo) {
		bd.atualizar(veiculo);
		return ResponseEntity.ok("Success");
	}
	 
	@DeleteMapping("/veiculo/{id}")
	public ResponseEntity<String> removeVeiculo(@PathVariable int id) {
		if (bd.apagar(id)) {
			return ResponseEntity.ok("DELETED");
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	
//	@GetMapping("/veiculo/teste")
//	public Veiculo testeVeiculo() {
//		Veiculo v = new Veiculo();
//		v.setId(1234);
//		v.setMarca("Vokis");
//		v.setModelo("Fusca");
//		v.setAno(1978);
//		v.setCor("Rosa");
//		v.setPreco(115800);
//		v.setTipo("esportivo");
//		v.setDetalhes("Veiculo impecavel. "
//				+ "Motor Porsche Cayenne Turbo, "
//				+ "acabamento em couro caramelo."
//				+ "Trio eletrico, multimidia com navegacao automatica, "
//				+ "rodas de 23 polegadas"
//				+ "camera de ré");
//		
//		return v;
//	}

	
	
}
