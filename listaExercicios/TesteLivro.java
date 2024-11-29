package listaExercicios;

public class TesteLivro {

	public static void main(String[] args) {

		Livro livro1 = new Livro("É assim que acaba", "Colleen Hoover", 376);
		Livro livro2 = new Livro("Orgulho e Preconceito", "Jane Austen", 432);

		System.out.println("Detalhes do Livro 1:");
		livro1.exibirDetalhes();
		System.out.println("Detalhes do Livro 2:");
		livro2.exibirDetalhes();
	}
}
