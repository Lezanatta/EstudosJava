package ExercicioExceçãoContaBancaria;

import Exceções.DominioException;

public class Conta {

	private Integer numero;
	private double saldo;
	private double limiteEmprestimo;
	private String titular;
	public Conta(Integer numero, double saldo, double limiteEmprestimo, String titular) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limiteEmprestimo = limiteEmprestimo;
		this.titular = titular;
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
	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}
	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void Deposito(double quantia) {
		saldo +=quantia;
	}
	
	public void Saque(double quantia) throws DomException{
		if(limiteEmprestimo < quantia) 
			throw new DomException("O valor a ser sacado é maior que seu limite!");
		if(saldo < quantia)
			throw new DomException("Voce não possui esse dinheiro para ser sacado!");
		else 
			saldo-=quantia;		
	}
	
}
