package listaExercicios;

public class TestePessoa {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Ana", 19);
		Pessoa pessoa2 = new Pessoa("Julia", 30);

		System.out.println("Informações Pessoa 1:");
		pessoa1.exibirInformacoes();
		System.out.println("Informações Pessoa 2:");
		pessoa2.exibirInformacoes();
	}

}
