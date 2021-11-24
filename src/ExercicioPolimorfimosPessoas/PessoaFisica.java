package ExercicioPolimorfimosPessoas;

public class PessoaFisica extends Pessoa {

	public double GastosComSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, double rendaAnual, double gastosComSaude) {
		super(nome, rendaAnual);
		GastosComSaude = gastosComSaude;
	}


	public double getGastosComSaude() {
		return GastosComSaude;
	}

	public void setGastosComSaude(double gastosComSaude) {
		GastosComSaude = gastosComSaude;
	}

	@Override
	public double CalculoImpostos() {
		double taxa = (getRendaAnual() < 20000) ? getRendaAnual() * 0.15: getRendaAnual() * 0.25;
		taxa -= (GastosComSaude * 0.50);
		if(taxa < 0.0)
			return 0;
		else
			return taxa;
	}

}
