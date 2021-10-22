programa
{
	inclua biblioteca Matematica --> mat
	// Programa para calcular expressao com tres variaveis
	 
	funcao inicio()
	{	
		
		inteiro a, b, c, resultado

		escreva("Informe o 1º numero da expressão: ")
		leia(a)

		escreva("Informe o 2º numero da expressão: ")
		leia(b)

		escreva("Informe o 3º numero da expressão: ")
		leia(c)

		resultado = ((mat.potencia((a+b),2)) + (mat.potencia((b+c),2)))/2


		escreva("O resultado da expressão é: " + resultado)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 131; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */