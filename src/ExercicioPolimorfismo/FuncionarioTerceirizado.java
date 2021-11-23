package ExercicioPolimorfismo;

public class FuncionarioTerceirizado extends Funcionario {

	private double despesaAdicional;
	
	public FuncionarioTerceirizado() {
		super();
	}
	
	public FuncionarioTerceirizado(String nome, Integer horas, double valorPorHora, double despesaAdicional) {
		super(nome, horas, valorPorHora);
		this.despesaAdicional = despesaAdicional;
	}

	public double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
	
	@Override
	public double Pagamento() {
		return super.Pagamento() + (despesaAdicional/100 * 110);
	}	
}
