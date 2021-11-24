package ExercicioPolimorfimosPessoas;

public class PessoaJuridica extends Pessoa {

	private Integer NumeroDeFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, double rendaAnual, Integer numeroDeFuncionarios) {
		super(nome, rendaAnual);
		NumeroDeFuncionarios = numeroDeFuncionarios;
	}

	public Integer getNumeroDeFuncionarios() {
		return NumeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		NumeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public double CalculoImpostos() {
		if(NumeroDeFuncionarios > 10)
			return getRendaAnual() * 0.14;
		else
			return getRendaAnual() * 0.16;
	}
}
