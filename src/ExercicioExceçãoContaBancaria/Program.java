package ExercicioExceçãoContaBancaria;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Entre com os dados da conta: ");
		System.out.print("Numero: ");
		Integer numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Nome:");
		String titular = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double saldo = sc.nextDouble();
		System.out.print("Limite de empréstimo: ");
		double limite = sc.nextDouble();
		Conta conta = new Conta(numero,saldo,limite,titular);
		
		System.out.print("Digite o valor a ser sacado: ");
		double saque = sc.nextDouble();
		conta.Saque(saque);
		System.out.println("Novo saldo: " + conta.getSaldo());
		}
		
		catch(DomException e) {
			System.out.println("Erro no saque! " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Erro inesperado!");
		}
		
		sc.close();

	}

}
