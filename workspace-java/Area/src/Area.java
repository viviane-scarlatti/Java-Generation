/* URI 1012
 * Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B. */

import java.util.Scanner;
public class Area {
	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		double A, B, C, trianguloRetangulo, circulo, trapezio, quadrado, retangulo;
		
		A = teclado.nextDouble();
		B = teclado.nextDouble();
		C = teclado.nextDouble();
		
		trianguloRetangulo = (A*C)/2;
		circulo = 3.14159*C*C;
		trapezio = ((A + B)*C)/2;
		quadrado = B*B;
		retangulo = A*B;
		
		System.out.printf("TRIANGULO: %.3f\n", trianguloRetangulo);
		System.out.printf("CIRCULO: %.3f\n", circulo);
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("RETANGULO: %.3f\n", retangulo);
		
		teclado.close();
				
	}
}
