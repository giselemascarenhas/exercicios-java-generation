import java.util.Scanner;

// Um sistema de equações lineares: 

public class Exercicio7 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double a, b, c, d, f, j, x, y;
					
		System.out.println("Informe o valor de a: ");
		a = entrada.nextInt();
		
		System.out.println("Informe o valor de b: ");
		b = entrada.nextInt();
		
		System.out.println("Informe o valor de c: ");
		c = entrada.nextInt();
		
		System.out.println("Informe o valor de d: ");
		d = entrada.nextInt();
		
		System.out.println("Informe o valor de j: ");
		j = entrada.nextInt();
		
		System.out.println("Informe o valor de f: ");
		f = entrada.nextInt();
		
		x = ((c*j) - (b*f) / (a*j) - (b*d));
		y = ((a*f) - (c*d) / (a*j) - (b*d));
		
		System.out.println("O valor de X é: " + x);
		System.out.println("O valor de Y é: " + y);
		
		entrada.close();
		}
}
		
		