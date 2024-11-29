package listaExercicios;

public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo bicicleta = new Bicicleta();

        System.out.println("Movimento do Carro:");
        carro.mover();

        System.out.println("\nMovimento da Bicicleta:");
        bicicleta.mover();
    }
}
