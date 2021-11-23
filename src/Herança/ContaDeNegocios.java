package Herança;

public class ContaDeNegocios extends Conta {

	private double limiteEmprestimo;
	
	public ContaDeNegocios() {
		super();
	}
	
	public ContaDeNegocios(Integer numero, String titular, double saldo, double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void Emprestimo(double quantia) {
		if(quantia<=limiteEmprestimo)
			Deposito(quantia);
	}
	
	@Override
	public void Saque(double quantia) {
		super.Saque(quantia);
		saldo -= 2.0;
	}
	
}
