public class Hello {	
	public static void main(String args[]) {
		
		float salarioMinimo, qtdeKw, valorKw, valorPago, novoValor;
		
		salarioMinimo = Float.parseFloat(args[0]);
		qtdeKw = Float.parseFloat(args[1]);

		
		valorKw = salarioMinimo/700;
		valorPago = qtdeKw*valorKw;
		novoValor = 0.9f*valorPago;
		
		System.out.println("Valor em reais de cada Kw = " +valorKw);
		System.out.println("Valor em reais a ser pago = " +valorPago);
		System.out.println("Novo valor com desconto = " +novoValor);
		
	}
}
