import java.util.Scanner;
public class Uri1060 {
	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		float x=0;
		int i, cont=0;
		
		for (i=1; i <=6; i++) {
			x=teclado.nextFloat();
		
			if (x>0) {
				cont++;
			}
		}
			System.out.println(cont+" valores positivos");
		teclado.close();
	}
}
