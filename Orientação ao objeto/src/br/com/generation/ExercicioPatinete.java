package br.com.generation;

public class ExercicioPatinete {

	public static void main(String[] args) {

		Patinete pat = new Patinete();

		pat.setMarca("Traxart");
		pat.setModelo("Scooter ProX");
		pat.setAno(2020);
		pat.setCor("Preto e vermelho");
		pat.setTipo("Urbano/Manobras");

		System.out.println("\tInformações do Patinete: ");
		System.out.println("Marca: " + pat.getMarca());
		System.out.println("Modelo: " + pat.getModelo());
		System.out.println("Ano: " + pat.getAno());
		System.out.println("Tipo: " + pat.getTipo());
		System.out.println("Cor: " + pat.getCor());

	}

}