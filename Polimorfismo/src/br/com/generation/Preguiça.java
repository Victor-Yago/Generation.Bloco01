package br.com.generation;

public class Preguiça implements Animal{

	@Override
	public void nome() {
		System.out.println("O nome da preguiça é Valter.");
		
	}

	@Override
	public void idade() {
		System.out.println("Valter tem 4 ano.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("A preguiça faz um barulho ao comer as folhas: croccroc");
		
	}

	@Override
	public void correr() {}

	@Override
	public void subirEmArvores() {
		System.out.println("A preguiça adora subir em árvores.\n\n");
		
	}

}