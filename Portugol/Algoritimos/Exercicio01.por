programa
{
	
	// Programa Calculadora de idade em dias de vida
	
	 
	funcao inicio()
	{
		
		inteiro anos, meses, dias, resultado
		
		escreva("Informe sua idade em anos: ")
		leia(anos)
		escreva("Informe os meses: ")
		leia(meses)
		escreva("Informe os dias: ")
		leia(dias)
		
		resultado = ((anos*365) + (meses*30) + dias)

		escreva("Idade em dias:" + resultado)

		
		
		
	}
}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 90; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */