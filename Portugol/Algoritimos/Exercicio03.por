programa
{
	// Programa de conversao de segundos para horas e minutos
	 
	funcao inicio()
	{
		
		inteiro horas, minutos, segundos

		escreva("Informe o tempo de duração do evento em segundos: ")
		leia(segundos)

		horas = segundos/3600
		minutos = (segundos%3600)/60
		segundos = (segundos%3600)%60

		escreva("Tempo em horas: " + horas)
		escreva("\nTempo em minutos: " + minutos)
		escreva("\nTempo em segundos: " + segundos)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 14; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */