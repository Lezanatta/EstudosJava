package Herança;

public class ContaPoupanca extends Conta{

	private double taxaDeJuros;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, String titular, double saldo, double taxaDeJuros) {
		super(numero, titular, saldo);
		this.taxaDeJuros = taxaDeJuros;
	}

	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	public void AtualizarSaldo() {
		saldo *= taxaDeJuros; 
	}	
	
	@Override
	public void Saque(double quantia) {
		saldo -= quantia;
	}
}
