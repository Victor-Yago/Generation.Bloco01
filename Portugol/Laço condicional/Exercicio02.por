programa
{
	//2-Programa de conversao de dias em anos, meses e dias de vida
	 	
	 
	funcao inicio()
	{	
		
		inteiro ano, meses, dias

		escreva("Informe sua idade em dias: ")
		leia(dias)

		ano = dias/365
		meses = ((dias % 365)/30)
		dias = (dias % 365)%30

		escreva("Sua idade em anos: " + ano + " anos")

		escreva("\nSua idade em meses: " + meses + " meses")

		escreva("\nSua idade em dias: " + dias + " dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 16; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */