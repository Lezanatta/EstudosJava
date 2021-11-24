package ExercicioPolimorfismoProdutos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Produto> produtos = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos produtos serão digitado? ");
		int prod = sc.nextInt();
		
		for(int i = 1; i <= prod; i++) {
			System.out.println("dados produto #" + i);
			System.out.print("Usado, importado ou comum? (u/i/c): ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			
			if(ch == 'u') {
				System.out.print("Data da fabricação (DD/MM/YYYY): ");
				Date data = sdf.parse(sc.next());				
				produtos.add(new ProdutoUsado(nome,preco,data));				
			}
			if(ch == 'i') {
				System.out.print("taxaAlfandegária: ");
				double taxa = sc.nextDouble();
				produtos.add(new ProdutoImportado(nome,preco,taxa));
			}
			if(ch == 'c') {
				produtos.add(new Produto(nome,preco));
			}
			if(ch != 'c' && ch != 'i' && ch != 'u')
				System.out.println("Voce não escreveu um produto (c/i/u)!!!");
			System.out.println();
		}
		
		System.out.println("ETIQUETA DE PREÇOS!");
		
		for(Produto p : produtos) {
			System.out.println(p.EtiquetaDePreco());
		}
		sc.close();
	}
}
