package br.com.generation.algoritimo;

import java.util.Scanner;


public class Exercicio03 {
	
//    3. Faça um sistema que leia o tempo de duração de um 
// 		 evento em uma fábrica expressa em segundos e 
// 		 mostre-o expresso em horas, minutos e segundos.
	

		public static void main(String[] args) {
	
			Scanner scan = new Scanner(System.in);
	
	
			int duracao, horas, minutos, segundos;
	
			System.out.println("Informe a duraçao do evento em segundos: ");
			duracao = scan.nextInt();
	
			horas = duracao / 3600;
			
			duracao %= 3600;
			minutos = duracao / 60;
			segundos = duracao % 60;
	
			System.out.println("****** A duracao do evento foi ******");
			System.out.println("Horas: " + horas);
			System.out.println("Minutos: " + minutos);
			System.out.println("Segundos: " + segundos);
	
			scan.close();
	
}

}