package br.com.generation;

import java.util.Scanner;
//4. Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
//psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
//era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
//(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
//agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
//pessoas, calcule e mostre: (WHILE)	

//o n�mero de pessoas calmas;
//o n�mero de mulheres nervosas;
//o n�mero de homens agressivos;
//o n�mero de outros calmos;
//o n�mero de pessoas nervosas com mais de 40 anos;
//o n�mero de pessoas calmas com menos de 18 anos.


		public class Exercicio04 {

		public static void main(String[] args) {
	
	
	   Scanner scan = new Scanner(System.in);
	
	   int idade, i = 0, calma = 0, fnervosa = 0, ocalma = 0 ,nervosa40 = 0, magressiva = 0, calma18 = 0;
	   char sexo, opcao;
	
			
	  while(i != 5) {
		
		System.out.println("Informe sua idade: ");
		idade = scan.nextInt();
		
		System.out.println("Informe seu sexo com F para Feminino e M para Masculino e O para Outro: ");
		sexo = scan.next().charAt(0);
		
		System.out.println("Escolha sua caracteristica com as opcoes abaixo: ");
		System.out.println("1 - Calma");
		System.out.println("2 - Nervosa");
		System.out.println("3 - Agressiva");
		opcao = scan.next().charAt(0);
		
		switch(opcao) {
		 	case '1': 
		 		calma++;
		 		
		 		if(sexo == 'O') {
		 			ocalma++;
		 		}
		 		if(idade < 18) {
		 			calma18++;
		 		}
		 		
		 	break;	
		 	case '2': 
		 		if(sexo == 'F') {
		 			fnervosa++;
		 		}
		 		if(idade > 40) {
		 			nervosa40++;
		 		}
		 	break;
		 	case '3': 
		 		if(sexo == 'M') {
		 			magressiva++;
		 		}
		 	break;
		}
		i++;
	}
	
	System.out.println("N�mero de pessoas calmas: " + calma);
	System.out.println("N�mero de mulheres nervosas: " + fnervosa);
	System.out.println("N�mero de homens agressivos: " + magressiva);
	System.out.println("N�mero de outros calmos: " + ocalma);
	System.out.println("N�mero de pessoas nervosas com mais de 40 anos: " + nervosa40);
	System.out.println("N�mero de pessoas calmas com menos de 18 anos: " + calma18);
	
	scan.close();
}

}
