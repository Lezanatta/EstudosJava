package ExercicioPedidos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Entre com os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Nascimento: (DD/MM/YYYY): ");
		Date nascimento = sdf.parse(sc.nextLine());
		Cliente cliente = new Cliente(nome,email,nascimento);
		System.out.println();
		
		System.out.println("Entre com os dados do pedido: ");
		System.out.print("Status: ");
		String status = sc.nextLine();
		System.out.print("Quantos itens terão no pedido? ");
		int n = sc.nextInt();
		Pedido pedido = new Pedido(new Date(),StatusPedido.valueOf(status),cliente);
		for(int i =1; i<=n; i++) {
			System.out.print("Nome do Produto "+"#" + i + ": ");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.print("Preco do produto: ");
			double preco = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();			
			Produto produto = new Produto(nome,preco);
			ItemPedido ip = new ItemPedido(quantidade,preco,produto);
			pedido.AdicionarItem(ip);
		}
		
		System.out.println();
		System.out.println("Ordem dos pedidos: ");
		System.out.println(pedido);	
		sc.close();

	}

}
