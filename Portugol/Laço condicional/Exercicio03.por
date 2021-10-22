programa
{
	inclua biblioteca Matematica --> mat
	//3-Programa para calcular o quadrado de um numero 
	  

	funcao inicio()
	{
		
		inteiro a, b, c, d, quadrado3

		escreva("Informe o 1º numero: ")
		leia(a)

		escreva("Informe o 2º numero: ")
		leia(b)

		escreva("Informe o 3º numero: ")
		leia(c)

		escreva("Informe o 4º numero: ")
		leia(d)

		quadrado3 = mat.raiz(c,2)
		se (quadrado3 >= 1000){
			escreva("O quadrado do 3º numero é: ", quadrado3)
		}
		senao{
			escreva("\nO 1º numero é: ", a)
			escreva("\nO quadrado do 1º numero é: ", mat.raiz(a,2))

			escreva("\nO 2º numero é: ", b)
			escreva("\nO quadrado do 2º numero é: ", mat.raiz(b,2))

			escreva("\nO 3º numero é: ", c)
			escreva("\nO quadrado do 3º numero é: ", mat.raiz(c,2))

			escreva("\nO 4º numero é: ", d)
			escreva("\nO quadrado do 4º numero é: ", mat.raiz(d,2))
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 129; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */