package br.com.generation.algoritimo;

import java.util.Scanner;

//		8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
//		percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
//		Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
//		escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
//		consumidor.

public class Exercicio08 {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		Double custo, preco;
		
		System.out.println("Informe o preco de f�brica do carro: ");
		custo = scan.nextDouble();
		
		preco = (custo * 1.28) + (custo * 0.45);
		
		System.out.println("O custo para o consumidor final �: " + preco);
		
		scan.close();
		
		
	}

}
