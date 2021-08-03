	import java.util.Scanner;
	
	// 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
	
	public class  Exercicio1 {

		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			int dia, mes, ano;
			int idade;
						
			System.out.println("Entre com o dia em que você nasceu: ");
			dia = entrada.nextInt();
			
			System.out.println("Entre com o mês em que você nasceu: ");
			mes = entrada.nextInt();
			
			System.out.println("Entre com o ano em que você nasceu: ");
			ano = entrada.nextInt();
					
			ano = (2021 - ano) * 365;
			mes = (12 - mes) * 12;
			idade = ano + mes + dia;
		
			System.out.println("Você tem " + idade + " dias");
			
			entrada.close();
			
		}
	}
