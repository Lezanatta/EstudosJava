package ExercicioPedidos;

public class ItemPedido {

	private Integer quantidade;
	private double preco;
	private Produto produto;
	
	public ItemPedido() {
		
	}
	
	public ItemPedido(Integer quantidade, double preco,Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double SubTotal() {
		return preco*quantidade;
	}

	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getProduto().getNome() + ", $");
		sb.append(String.format("%.2f",preco) + ", ");
		sb.append("Quantidade: " + quantidade + ", ");
		sb.append("Subtotal: $" + String.format("%.2f", SubTotal()));		
		return sb.toString();
	}

}
