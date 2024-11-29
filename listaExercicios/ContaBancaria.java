package listaExercicios;

public class ContaBancaria {
	
	private Integer numero;
	protected Double saldo;
	
	public ContaBancaria(Integer numero, Double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void sacar(Double valor) {
		saldo -= (valor + 5.0);
	}
	
	public void depositar(Double valor) {
		saldo += valor;
	}
	

}
