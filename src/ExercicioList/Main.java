package ExercicioList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		List<Funcionario> funcionarios = new ArrayList<>();
		System.out.print("Quantos funcionarios serão registrados? ");
		
		int quantidade = ler.nextInt();
		
		for(int i =0;i<quantidade;i++) {
			System.out.println("Funcionario: #" + (i+1) + ":");
			System.out.print("Id:");
			Integer id = ler.nextInt();
			while(TemId(funcionarios, id)) {
				System.out.print("Já existe esse id! Tente novamente: ");
				id = ler.nextInt();
			}
			System.out.print("Name: ");
			ler.nextLine();
			String name = ler.nextLine();
			System.out.print("Salary: ");
			Double salary = ler.nextDouble();
			System.out.println("");
			funcionarios.add(new Funcionario(id,name,salary));
		}
		
		System.out.print("Entre com o id que terá o salario aumentado: ");
		int id = ler.nextInt();
		
		Funcionario fun = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(fun == null) 
			System.out.println("Esse id não existe.");
		else {
			System.out.print("Entre com a porcentagem: ");
			double porcentagem = ler.nextDouble();
			fun.AumentarSalary(porcentagem);
		}
		
		System.out.println("");
		for(Funcionario f : funcionarios) {
			System.out.println(f);
		}
		
		ler.close();
	}
	
	public static Integer position(List<Funcionario> list, int id) {
		for(int i = 0; i<list.size();i++) {
			if(list.get(i).getId() == id)
				return i;
		}
		return null;		
	}
	
	public static boolean TemId(List<Funcionario> func, int id) {
		Funcionario f = func.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			return f !=null;
	}
}
