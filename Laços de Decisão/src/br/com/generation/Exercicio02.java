package br.com.generation;

import java.util.Scanner;


//		2. Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.



public class Exercicio02 {

public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	int n1, n2, n3;

	System.out.println("Digite 3 n�meros: ");
	n1 = scan.nextInt();
	n2 = scan.nextInt();
	n3 = scan.nextInt();


	if(n1 <= n2 && n2 <= n3) {

		System.out.println("A ordem crescente: " + n1 + " " + n2 + " " + n3);

	}
	else if(n1 <= n3 && n3 <= n2) {

		System.out.println("A ordem crescente: " + n1 + " " + n3 + " " + n2);
	}
	else if(n2 <= n1 && n1 <= n3) {

		System.out.println("A ordem crescente: " + n2 + " " + n1 + " " + n3);
	}
	else if(n2 <= n3 && n3 <= n1) {

		System.out.println("A ordem crescente: " + n2 + " " + n3 + " " + n1);
	}
	else if(n3 <= n1 && n1 <= n2) {

		System.out.println("A ordem crescente: " + n3 + " " + n1 + " " + n2);
	}
	else /*if(n3 <= n2 && n2 <= n1)*/ {

		System.out.println("A ordem crescente: " + n3 + " " + n2 + " " + n1);
	}

	scan.close();
}

}
