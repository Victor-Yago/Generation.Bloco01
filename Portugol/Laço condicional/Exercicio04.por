programa
{
	//4-Programa para identificar um numero 
	
	funcao inicio()
	{
		
		inteiro numero

		escreva("Informe um número: ")
		leia(numero)

		se ((numero % 2) == 0){
			se (numero >= 0){
				escreva("O número digitado ", numero, " é par e positivo")
			}
			senao{
				escreva("\nO número digitado ", numero, " é par e negativo")
			}

		}
		senao {
			se (numero >= 0){
				escreva("O número digitado ", numero, " é ímpar e positivo")
			}
			senao{
				escreva("\nO número digitado ", numero, " é ímpar e negativo")	
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 77; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */