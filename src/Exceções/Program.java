package Exceções;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Numero do quarto: ");
			int numero = sc.nextInt();
			System.out.print("Data de check-in (DD/MM/YYYY): ");
			Date checkin = sdf.parse(sc.next());
			System.out.print("Data de check-out (DD/MM/YYYY): ");
			Date checkout = sdf.parse(sc.next());
			Reserva reserva = new Reserva(numero,checkin,checkout);
			System.out.println("Reserva: " + reserva);
			
			System.out.println();
			
			System.out.println("Entre com os dados para atualização da reserva:");
			System.out.print("Data de check-in (DD/MM/YYYY): ");
			checkin = sdf.parse(sc.next());
			System.out.print("Data de check-out (DD/MM/YYYY): ");
			checkout = sdf.parse(sc.next());
			reserva.AtualizarData(checkin, checkout);
			
			System.out.println("Reserva: " + reserva);	
		}
		catch(ParseException e) {
			System.out.println("Data inválida!");
		}
		catch(DominioException e) {
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Erro inesperado!");
		}
		sc.close();
		}
}
