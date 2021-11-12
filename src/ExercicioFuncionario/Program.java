package ExercicioFuncionario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do departamento: ");
		String departament = sc.nextLine();
		System.out.println("Entre com os dados do trabalhador: ");
		System.out.print("Name: ");
		String name = sc.nextLine();	
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Base salarial: ");
		double salario = sc.nextDouble();
		
		Funcionario funcionario = new Funcionario(
				name,LevelTrabalhador.valueOf(level),salario,new Departamento(departament));
		
		System.out.print("Quantos contratos esse trabalhador terá: ");
		int n = sc.nextInt();
		
		for(int i = 1;i<=n;i++) {
			System.out.println("Entre com o numero do contrato #" + i + ":");
			System.out.print("Data: (DD/MM/YYYY): ");
			Date contratoDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração de horas: ");
			int horas = sc.nextInt();
			HorasContrato contrato = new HorasContrato(contratoDate,valorPorHora,horas);
			funcionario.AdicionarContrato(contrato);
		}
		System.out.println();
		System.out.print("Entre com o mes e ano (MM/YYYY): ");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0,2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		
		System.out.println("Name: " + funcionario.getNome());
		System.out.println("Departamento: " + funcionario.getDepartamento().getNome());
		System.out.println("Renda em "+ mesEAno+": " + String.format("%.2f", funcionario.Renda(ano, mes)));	
		sc.close();
	}

}
