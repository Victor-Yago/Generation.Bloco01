package br.com.generation;

public class Cavalo implements Animal{

	@Override
	public void nome() {
		System.out.println("O nome do Cavalo é Rodolfo");
		
	}

	@Override
	public void idade() {
		System.out.println("Rodolfo tem 12 anos.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("O cavalo gosta de relinchar: IIIRRRRÍ");
		
	}

	@Override
	public void correr() {
		System.out.println("O cavalo está correndo...\n\n");
		
	}

	@Override
	public void subirEmArvores() {}

}