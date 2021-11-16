package ExercicioPedidos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

	private Date momento;
	private StatusPedido status;
	private Cliente cliente;
	private List<ItemPedido> itensPedido = new ArrayList<ItemPedido>();
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	public Pedido() {
		
	}
	public Pedido(Date momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}
	public Date getMomento() {
		return momento;
	}
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	public StatusPedido getStatus() {
		return status;
	}
	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<ItemPedido> getItemPedido() {
		return itensPedido;
	}
	
	public void AdicionarItem(ItemPedido item) {
		itensPedido.add(item);
	}
	
	public void RemoverItem(ItemPedido item) {
		itensPedido.remove(item);
	}
	
	public double Total() {
		double soma =0;
		for(ItemPedido item : itensPedido) {
			soma += item.SubTotal();
		}
		return soma;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: " + sdf.format(momento) + "\n");
		sb.append("Status do pedido: " + status + "\n");
		sb.append(cliente + "\n");
		sb.append("Ordem dos itens: " + "\n");
		for(ItemPedido item : itensPedido) {
			sb.append(item + "\n");
		}
		sb.append("Preco Total: " + Total());	
		return sb.toString();
	}
}
