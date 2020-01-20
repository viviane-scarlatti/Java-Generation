package br.org.generation.webmotors.bd;

import java.util.ArrayList;

import br.org.generation.webmotors.model.Veiculo;

public class BDVeiculo {
	private ArrayList<Veiculo> lista;
	
	public BDVeiculo() {
		lista = new ArrayList<Veiculo>();
	}
	
	// CREATE
	public void gravar(Veiculo v) {
		this.lista.add(v);
		
	}
	// READ
	public Veiculo buscar(int id) {
		Veiculo v = null;
		for (Veiculo vei: lista) {
			if (vei.getId() == id) {
				v = vei;
				break;
			}
		}
		return v;
	}
	
	// UPDATE
    public void atualizar(Veiculo v) {
    	int posicao=-1;
		for (int i=0; i< lista.size(); i++) {
			if (lista.get(i).getId() == v.getId()) {
				posicao = i;
				break;
			}
		}
		if (posicao >=0) {
			lista.set(posicao, v);
		}	
	}
    // DELETE
	public boolean apagar(int id) {
		int posicao=-1;
		for (int i=0; i< lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				posicao = i;
				break;
			}
		}
		if (posicao >=0) {
			lista.remove(posicao);
			return true;
		}
		return false;				
	}
	
	public ArrayList<Veiculo> buscarTodos(){
		return lista;
	}
	
}
	

