import java.util.Scanner;
public class Uri1017 {
	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int tempo, velocidadeMedia, distancia;
		float litros;
		
		tempo = teclado.nextInt();
		velocidadeMedia = teclado.nextInt();
		
		distancia = velocidadeMedia*tempo;
		litros = distancia/12f;
		
		System.out.printf("%.3f\n", litros);
		
		teclado.close();
	}
}
