package ExercicioPolimorfismoProdutos;


import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	
	private Date dataFabricacao;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public String EtiquetaDePreco() {
		StringBuilder sb = new StringBuilder();
		sb.append(getNome());
		sb.append(" (Usado) $ " + String.format("%.2f", getPreco()));
		sb.append(" (Data da fabricação: " + sdf.format(dataFabricacao) +")");
		return sb.toString();
	}	
}
