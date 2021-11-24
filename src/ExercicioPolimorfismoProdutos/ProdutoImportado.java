package ExercicioPolimorfismoProdutos;

public class ProdutoImportado extends Produto{

	private double taxaAlfandeg�ria;
	
	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, double preco, double taxaAlfandeg�ria) {
		super(nome, preco);
		this.taxaAlfandeg�ria = taxaAlfandeg�ria;
	}

	public double getTaxaAlfandeg�ria() {
		return taxaAlfandeg�ria;
	}

	public void setTaxaAlfandeg�ria(double taxaAlfandeg�ria) {
		this.taxaAlfandeg�ria = taxaAlfandeg�ria;
	}
	
	public double PrecoTotal() {
		return getPreco() + taxaAlfandeg�ria;
	}
	
	@Override
	public String EtiquetaDePreco() {
		StringBuilder sb = new StringBuilder();
		sb.append(getNome());
		sb.append(" $ " + String.format("%.2f", PrecoTotal()));
		sb.append(" (Taxa alfandeg�ria: " + taxaAlfandeg�ria +")");
		return sb.toString();
	}
}
