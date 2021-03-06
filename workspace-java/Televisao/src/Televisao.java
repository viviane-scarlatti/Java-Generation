public class Televisao {
	// informacoes sobre uma TV
	private String  marca;
	private int     voltagem;
	private int     tamanho;
	private boolean ligada;
	private int     volume;
	private int     canal;
	
	// declarando o metodo construtor
	public Televisao(String marca, int voltagem, int tamanho) {
		this.marca = marca;
		this.voltagem = voltagem;
		this.tamanho = tamanho;
		this.ligada = false;
		this.volume = 2;
		this.canal = 5;
	}
	
	// sets e gets
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	
	public int getVoltagem() {
		return voltagem;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public int getTamanho() {
		return tamanho;
	}
	
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	public boolean isLigada() {
		return ligada;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getVolume() {
		return volume;
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int canal() {
		return canal;
	}
	
	// fun��es 
	void switchPower() {
		ligada = !ligada;
		System.out.println("A TV "+marca+" est� "+ ((ligada)?"ligada":"desligada"));
		// operador ternario de atribuicao condicional
		/*
		 *   (testeLogico)? <ValorSeTesteForVerdadeiro> : <ValorSeTesteForFalso>
		 *   
		 */
	}
	
	void aumentarVolume() {
		if (ligada == true) {
			if (volume<10) {
				volume++;
				System.out.println("A TV "+marca+" est� no volume "+volume);}
			else {
				volume=10;
				System.out.println("O volume est� no m�ximo");
			}
		}
		else {
			System.out.println("Por favor, primeiro ligue a TV");
		}
	}
				
	void diminuirVolume() {
		if (ligada == true) {
			if (volume > 0) {
		volume--;
		System.out.println("A TV "+marca+" est� no volume "+volume);
		}
			else {
				volume = 0;
				System.out.println("O volume est� no m�nimo");
			}
		}
		else {
			System.out.println("Por favor, primeiro ligue a TV");
		}
	}
	
	void avancarCanal() {
		if (ligada == true) {
			if (canal < 10) {
				canal++;
				System.out.println("A TV est� no canal "+canal);
			}
			else {
				canal = 1;
				System.out.println("A TV est� no canal "+canal);
			}
		}
		else {
			System.out.println("Por favor, primeiro ligue a TV");
		}
	}
	
	void voltarCanal() {
		if (ligada == true) {
			if (canal >= 1) {
				canal--;
				System.out.println("A TV est� no canal "+canal);
			}
			else {
				canal = 10;
				System.out.println("A TV est� no canal "+canal);
			}
		}
		else {
			System.out.println("Por favor, primeiro ligue a TV");
		}
	}
	
}
