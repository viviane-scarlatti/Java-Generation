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
			System.out.println("S�o m�ltiplos");
		else
			System.out.println("N�o s�o m�ltiplos");
		}
		else
			if (b > a) {
				if (b % a == 0)
					System.out.println("S�o m�ltiplos");
				else
					System.out.println("N�o s�o m�ltiplos");
			}
		teclado.close();
	}
}