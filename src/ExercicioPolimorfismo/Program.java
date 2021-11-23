package ExercicioPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Funcionario> funcionarios = new ArrayList<>();
		
		System.out.print("Entre com o numero de funcionários:");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados do #" + (i+1) + " Funcionario: ");
			System.out.print("Esse funcionário é terceirizado (s/n)? ");
			char terceirizado = sc.next().charAt(0);
			sc.nextLine();
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Horas: ");
				Integer horas = sc.nextInt();
				System.out.print("Valor por hora: ");
				double valorPorHora = sc.nextDouble();
				if(terceirizado == 'n') {
					funcionarios.add(new Funcionario(nome,horas,valorPorHora));
				}
				else {
				System.out.print("Despesa adicional: ");
				double despesa = sc.nextDouble();
				sc.nextLine();				
				funcionarios.add(new FuncionarioTerceirizado(nome,horas,valorPorHora,despesa));
			}
		}
			System.out.println();
			System.out.println("PAGAMENTOS:");
			for(Funcionario fun : funcionarios) {
				System.out.println(fun.getNome() + " - $ " + fun.Pagamento());
			}
			
		sc.close();
	}

}
