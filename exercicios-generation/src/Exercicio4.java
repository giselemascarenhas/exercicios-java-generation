import java.lang.Math;
import java.util.Scanner;

// Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o:  
// D = R + S / 2     onde R = (A+B)�  e S = (B + C)�

public class Exercicio4 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double a, b, c, r, s;
					
		System.out.println("Informe o valor de a: ");
		a = entrada.nextInt();
		
		System.out.println("Informe o valor de b: ");
		b = entrada.nextInt();
		
		System.out.println("Informe o valor de c: ");
		c = entrada.nextInt();
		
		r = Math.pow(a*b, 2);
		s = Math.pow(b*c, 2);
		
		System.out.println("O valor de R �: " + r);
		System.out.println("O valor de S �: " + s);
		
		entrada.close();
		
	}
}
