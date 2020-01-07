import java.util.Scanner;
public class Uri1044 {
	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int a, b;
		
		a = teclado.nextInt();
		b = teclado.nextInt();
		
		if (a > b) {
		if (a % b == 0)
			System.out.println("São múltiplos");
		else
			System.out.println("Não são múltiplos");
		}
		else
			if (b > a) {
				if (b % a == 0)
					System.out.println("São múltiplos");
				else
					System.out.println("Não são múltiplos");
			}
		teclado.close();
	}
}
