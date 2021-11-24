package Herança;

public class Program {

	public static void main(String[] args) {
		
		/*Conta acc = new Conta(1001,"Leandro", 0);
		ContaDeNegocios contaDeNegocios = new ContaDeNegocios(1002,"Maria",0,500);
		
		//UPCASTING
		
		Conta acc1 = contaDeNegocios;
		Conta acc2 = new ContaDeNegocios(1003,"Bob",0,200);
		Conta acc3 = new ContaPoupanca(1004, "Ana", 0,0.01);
		
		//DOWCASTING
		
		ContaDeNegocios acc4 = (ContaDeNegocios) acc2;
		acc4.Emprestimo(100);
		
		//ContaDeNegocios acc5 = (ContaDeNegocios) acc3;
		
		if(acc3 instanceof ContaDeNegocios) {
			ContaDeNegocios acc5 = (ContaDeNegocios) acc3;
			acc5.Emprestimo(200);
			System.out.println("Empréstimo!");
		}
		
		if(acc3 instanceof ContaPoupanca) {
			ContaPoupanca acc5 = (ContaPoupanca) acc3;
			acc5.AtualizarSaldo();
			System.out.println("Atualizado!");
		}	*/
		
		Conta acc1 = new Conta(1001, "Alex", 1000.0);
		acc1.Saque(200);
		System.out.println(acc1.getSaldo());
		
		Conta acc2 = new ContaDeNegocios(1002, "Leandro", 1000.0, 0.01);
		acc2.Saque(200);
		System.out.println(acc2.getSaldo());
		
		Conta acc3 = new ContaPoupanca(1003, "Bia", 1000.0, 500);
		acc3.Saque(200);
		System.out.println(acc3.getSaldo());
	}
}
