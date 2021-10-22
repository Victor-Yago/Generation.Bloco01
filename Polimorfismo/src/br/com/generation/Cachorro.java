package br.com.generation;

public class Cachorro implements Animal{

	@Override
	public void nome() {
		System.out.println("O nome do cachorro é Kleber");
		
	}

	@Override
	public void idade() {
		System.out.println("Kleber tem 7 anos");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("O cachorro late");
		
	}

	@Override
	public void correr() {
		System.out.println("O cachorro está correndo.\n\n");
		
	}

	@Override
	public void subirEmArvores() {}

}