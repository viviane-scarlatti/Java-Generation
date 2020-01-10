public class QuestaoSimples {
	protected String enunciado;
	protected String resposta;
	
	// construtor
	public QuestaoSimples(String enunciado, String resposta) {
		this.enunciado = enunciado;
		this.resposta = resposta;
	}
	
	// getters e setters
	public String getEnunciado() {
		return enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	// métodos
	public String aplicarQuestao() {
		return enunciado;
	}
	
	public boolean corrigir(String respUser) {
		return resposta.equals(respUser);	
}
}
	

