public class Produto {
	private int id;
	private String nome;
	private String detalhes;
	private float preco;
	private float qtdEstoque;
	
	// constructor
	public Produto(int id, String nome, String detalhes, float preco, float qtdEstoque) {
		this.id = id;
		this.nome = nome;
		this.detalhes = detalhes;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
	}
	
	public Produto() {
	}
	
	// getters e setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if (id<=0) {
			throw new RuntimeException("ID nao pode ser menor ou igual a zero");	
		}
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome == null || nome.length() == 0 ) {
			throw new RuntimeException("NOME nao pode estar vazio");
		}
		this.nome = nome;
	}
	
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		if (detalhes == null || detalhes.length() == 0) {
			throw new RuntimeException("DETALHES nao pode estar vazio");
		}
		this.detalhes = detalhes;
	}
	
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		if (preco <=0) {
			throw new RuntimeException("PRECO nao pode ser menor ou igual a zero");
		}
		this.preco = preco;
	}
	
	public float getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(float qtdEstoque) {
		if (qtdEstoque < 0) {
			throw new RuntimeException("QTDESTOQUE nao pode ser negativo");
		}
		this.qtdEstoque = qtdEstoque;
	}
	
	public String toString() {
		return this.id+";"+this.nome+" R$ "+this.preco+ " ("+this.qtdEstoque+")";
	}
	
}
