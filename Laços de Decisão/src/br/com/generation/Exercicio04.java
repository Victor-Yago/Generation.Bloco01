package br.com.generation;

import java.util.Scanner;

//		4. Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
//		n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
//		�mpar exiba o n�mero elevado ao quadrado.

public class Exercicio04 {


public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);


	int num;
	double raiz, quadrado;

	System.out.println("Informe um n�mero: ");
	num = scan.nextInt();

	if(num % 2 == 0) {

		quadrado = Math.sqrt(num);
		System.out.println("O numero � Par. Sua raiz quadrada �: " + quadrado);
	}
	else {
		raiz = Math.pow(num, 2);
		System.out.println("O numero � �mpar. Sua raiz quadrada �: " + raiz);
	}

	scan.close();

		}

}