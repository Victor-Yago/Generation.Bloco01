package br.com.generation;

import java.util.Scanner;


//5- Crie um programa que leia um n�mero do teclado at� que encontre um
//n�mero igual a zero. No final, mostre a soma dos n�meros
//digitados.(DO...WHILE)


		public class Exercicio05 {

      public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		int soma = 0, num = 0;
		
		do {
			System.out.println("Informe um numero ou digite 0 para sair: ");
			num = scan.nextInt();
			
			soma += num;
			
		} while(num != 0);
		
		System.out.println("A soma dos numeros �: " + soma);
		
		scan.close();
	}

}
