package ExercicioPolimorfismoProdutos;

public class ProdutoImportado extends Produto{

	private double taxaAlfandegária;
	
	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, double preco, double taxaAlfandegária) {
		super(nome, preco);
		this.taxaAlfandegária = taxaAlfandegária;
	}

	public double getTaxaAlfandegária() {
		return taxaAlfandegária;
	}

	public void setTaxaAlfandegária(double taxaAlfandegária) {
		this.taxaAlfandegária = taxaAlfandegária;
	}
	
	public double PrecoTotal() {
		return getPreco() + taxaAlfandegária;
	}
	
	@Override
	public String EtiquetaDePreco() {
		StringBuilder sb = new StringBuilder();
		sb.append(getNome());
		sb.append(" $ " + String.format("%.2f", PrecoTotal()));
		sb.append(" (Taxa alfandegária: " + taxaAlfandegária +")");
		return sb.toString();
	}
}
