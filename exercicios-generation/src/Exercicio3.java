import java.util.Scanner;

//  Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos.  

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int segundos, minutos, horas;
					
		System.out.println("Informe o valor em segundos: ");
		segundos = entrada.nextInt();
		
		horas = segundos / 3600;
		minutos = (horas * 3600) / 60;
		segundos = horas * 3600;
	
		System.out.println( horas + " horas");
		System.out.println(minutos + " minutos");
		System.out.println(segundos + " segundos");
		
		entrada.close();
		
	}
}
