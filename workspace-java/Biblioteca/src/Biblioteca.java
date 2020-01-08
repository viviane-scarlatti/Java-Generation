public class Biblioteca {
	// informações sobre o livro
	private String titulo;
	private String autor;
	private String ano;
	private String categoria;
	private int    numEstante;
	private int    numPrateleira;
	public boolean emprestado;
	
	// construtor
	public Biblioteca(String titulo, String autor, String ano, String categoria,
	int numEstante, int numPrateleira, boolean emprestado) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.categoria = categoria;
		this.numEstante = numEstante;
		this.numPrateleira = numPrateleira;
		this.emprestado = emprestado;						
	}

	// getters e setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getNumEstante() {
		return numEstante;
	}

	public void setNumEstante(int numEstante) {
		this.numEstante = numEstante;
	}

	public int getNumPrateleira() {
		return numPrateleira;
	}

	public void setNumPrateleira(int numPrateleira) {
		this.numPrateleira = numPrateleira;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}



}
