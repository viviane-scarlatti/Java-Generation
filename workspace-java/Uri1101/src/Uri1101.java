import java.util.Scanner;
public class Uri1101 {
	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		int m=0, n=0, sum=0;
		
		while ((m = teclado.nextInt())>0 && ((n = teclado.nextInt())>0)) {
			if (m>n) {
				for (n=n; n<=m; n++) {
					sum = sum + n;
					System.out.print(n+ " ");
				}
				System.out.print("Sum="+sum+"\n");
			}
			else {
				for (m=m; m<=n; m++) {
					sum = sum + m;
					System.out.print(m+ " ");
				}
				System.out.print("Sum="+sum+"\n");
			}			
		}	
		
		teclado.close();
	}
}
