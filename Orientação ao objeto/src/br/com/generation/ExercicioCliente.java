package br.com.generation;

public class ExercicioCliente {

	public static void main(String[] args) {

		Cliente cli = new Cliente();

		cli.setNome("Clovis de Castro");
		cli.setIdade(42);
		cli.setRg("33.333.333-3");
		cli.setEndereco("Rua Mirandopolis, 10");

		System.out.println("\t Informações do cliente: ");
		System.out.println("\nNome: " + cli.getNome());
		System.out.println("Idade: " + cli.getIdade());
		System.out.println("Documento: " + cli.getRg());
		System.out.println("Endereço: " + cli.getEndereco());


	}

}