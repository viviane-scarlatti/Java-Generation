import java.util.Scanner;
public class Uri1047 {
	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int horaInicial, minutoInicial, horaFinal, minutoFinal, totalHoras=0, totalMinutos=0;
	
		horaInicial = teclado.nextInt();
		minutoInicial = teclado.nextInt();
		horaFinal = teclado.nextInt();
		minutoFinal = teclado.nextInt();
		
		
		if (horaInicial < horaFinal)
			totalHoras = horaFinal - horaInicial;
		else
		if (minutoInicial < minutoFinal)
			totalMinutos = minutoFinal - minutoInicial;
		else
		if (horaInicial > horaFinal)
			totalHoras = (24 - horaInicial) + horaFinal;
		else
		if (minutoInicial > minutoFinal)
			totalMinutos = (60 - minutoInicial) + minutoFinal;
		else
		if (horaInicial==horaFinal)
			totalHoras = 24;
		else	
		if (minutoInicial == minutoFinal)
			totalMinutos = 0; 
		
		System.out.println("O JOGO DUROU " + totalHoras + " HORA (S) E " + totalMinutos + " MINUTO (S)");
		teclado.close();
	}

}
