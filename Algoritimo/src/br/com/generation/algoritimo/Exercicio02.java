package br.com.generation.algoritimo;

import java.util.Scanner;

public class Exercicio02 {

		// 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
	


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		int anos, meses, dias, totalDias;
		
		System.out.println("Informe quantos anos voce ja viveu: ");
		totalDias = scan.nextInt();
	
		
		anos = totalDias/365;
		
		totalDias %= 365;
		meses = totalDias/30;
		dias = totalDias%30;
		
		System.out.println("Sua idade é: ");
		System.out.println("Anos: " + anos);
		System.out.println("Meses: " + meses);
		System.out.println("Dias: " + dias);
		
		scan.close();
		
		
	}

}