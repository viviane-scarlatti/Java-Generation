import java.util.Scanner;
public class Uri1045 {
	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		double a, b, c, aux;
		a = teclado.nextDouble();
		b = teclado.nextDouble();
		c = teclado.nextDouble();
		
		// a � o maior dos lados
		if (a<b) {
			aux = b;
			b = a;
			a = aux;
		}
		if (a<c) {
			aux = c;
			c = a;
			a = aux;
		}

		//
		if ( a >= (b+c) )
			System.out.println("NAO FORMA TRIANGULO");
		else {
			if ((a*a)==((b*b) + (c*c)))
				System.out.println("TRIANGULO RETANGULO");
			if ((a*a)>((b*b)+(c*c)))
				System.out.println("TRIANGULO OBTUSANGULO");
			if ((a*a)<((b*b)+(c*c)))
				System.out.println("TRIANGULO ACUTANGULO");
			if (a==b && a==c)
				System.out.println("TRIANGULO EQUILATERO");
			if ((a==b || a==c || b==c) && (a != b || a !=c ))
				System.out.println("TRIANGULO ISOSCELES");
		}
		teclado.close();							
	}
}
