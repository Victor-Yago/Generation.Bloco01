programa
{
	//5-Programa para identificar poluicao 
	
	funcao inicio()
	{
		
		real poluicao

		escreva("Informe o indíce de poluicao: ")
		leia(poluicao)

		se (poluicao >= 0.3 e poluicao < 0.4){
			escreva("Certifico que o indice de poluicao foi pontuado em ", poluicao, 
			" conforme o controle da Secretaria de MA, as empresas do 1º grupo sao intimadas a suspender suas atividades")
		}
		senao se (poluicao >= 0.4 e poluicao < 0.5){
			escreva("Certifico que o indice de poluicao foi pontuado em ", poluicao, 
			" conforme o controle da Secretaria de MA, as empresas do 1º e 2º grupos sao intimadas a suspender suas atividades")
		}
		senao se (poluicao >= 0.5){
			escreva("Certifico que o indice de poluicao foi pontuado em ", poluicao, 
			" conforme o controle da Secretaria de MA, as empresas de todos grupos sao intimadas a suspender suas atividades")
		}
		senao{
			escreva("Certifico que o indice de poluicao foi pontuado em ", poluicao)
		}
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