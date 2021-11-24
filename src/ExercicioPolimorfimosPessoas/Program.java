package ExercicioPolimorfimosPessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Pessoa> pessoas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o numero de pessoas: ");
		int n = sc.nextInt();
		
		for(int i =1; i <= n; i++) {
			System.out.println("Dados da #" + i + " pessoa: ");
			System.out.print("Pessoa Fisica ou juridica (f/j): ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda Anual: ");
			double renda = sc.nextDouble();
			if(ch == 'f') {
				System.out.print("Gastos com saude: ");
				double gastos = sc.nextDouble();
				pessoas.add(new PessoaFisica(nome,renda,gastos));
			}
			else {
				System.out.print("Numero de funcionarios: ");
				int numero = sc.nextInt();
				sc.nextLine();
				pessoas.add(new PessoaJuridica(nome,renda,numero));
			}
		}
		System.out.println();
		System.out.println("Impostos Pagos: ");
		double sum = 0;
		
		for(Pessoa p : pessoas) {
			System.out.println(p.getNome() + ": $ " + String.format("%.2f", p.CalculoImpostos()));
			sum+=p.CalculoImpostos();
		}
		System.out.println();
		System.out.println("TOTAL DE IMPOSTOS PAGOS: " + String.format("%.2f", sum));
		
		sc.close();
	}
}
