package br.com.generation;

public class Pregui�a implements Animal{

	@Override
	public void nome() {
		System.out.println("O nome da pregui�a � Valter.");
		
	}

	@Override
	public void idade() {
		System.out.println("Valter tem 4 ano.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("A pregui�a faz um barulho ao comer as folhas: croccroc");
		
	}

	@Override
	public void correr() {}

	@Override
	public void subirEmArvores() {
		System.out.println("A pregui�a adora subir em �rvores.\n\n");
		
	}

}