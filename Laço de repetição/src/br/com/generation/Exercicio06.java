package br.com.generation;

import java.util.Scanner;

//		6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
//		final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
//		0(zero).(DO...WHILE)


		public class Exercicio06 {
	
	 public static void main(String[] args) {
	
	 Scanner scan = new Scanner(System.in);
	
	  int num, cont = 0;
	  double  media = 0.0;
		
	
	  do {

		System.out.println("Informe um numero ou digite 0 para sair: ");
		num = scan.nextInt();
		
		if(num % 3 == 0 && num != 0) {
			media += num;
			cont++;
		}
		
		
	  } while(num != 0);
	
	 media /= cont;
	
	 System.out.println("Voce informou " + cont + " multiplos de 3");
	 System.out.println("A m�dia dos multiplos de 3 digitados �: " + media);
	
	 scan.close();
	 
   }

}
