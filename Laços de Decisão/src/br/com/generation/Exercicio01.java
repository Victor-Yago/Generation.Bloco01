package br.com.generation;

import java.util.Scanner;

//	1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

			public class Exercicio01 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	int n1, n2, n3;

	System.out.println("Informe tres n�meros: ");

	n1 = scan.nextInt();
	n2 = scan.nextInt();
	n3 = scan.nextInt();

	if(n1 >= n2 && n1 >= n3) {
		System.out.println("O maior �: " + n1);
	}
	
	else if(n2 >= n1 && n2 >= n3) {
		System.out.println("O maior �: " + n2);
	}
	
	else {
	
		System.out.println("O maior �: " + n3);
	}

	scan.close();
}

}