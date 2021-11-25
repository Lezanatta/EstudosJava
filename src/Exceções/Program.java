package Exceções;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero do quarto: ");
		int numero = sc.nextInt();
		System.out.print("Data de check-in (DD/MM/YYYY): ");
		Date checkin = sdf.parse(sc.next());
		System.out.print("Data de check-out (DD/MM/YYYY): ");
		Date checkout = sdf.parse(sc.next());
		
		if(!checkout.after(checkin)) {
			System.out.println("Erro na reserva! a data de check-out deve ser posterior ao check-in!");
		}else {
			Reserva reserva = new Reserva(numero,checkin,checkout);
			System.out.println("Reserva: " + reserva);
			
			System.out.println();
			
			System.out.println("Entre com os dados para atualização da reserva:");
			System.out.print("Data de check-in (DD/MM/YYYY): ");
			checkin = sdf.parse(sc.next());
			System.out.print("Data de check-out (DD/MM/YYYY): ");
			checkout = sdf.parse(sc.next());
			
			Date agora = new Date();
			if(checkin.before(agora) || checkout.before(agora)) {
				System.out.println("Erro na reserva! "
						+ "As datas de reserva para atualização devem ser datas futuras!");
			}
			else if(!checkout.after(checkin)){
				System.out.println("Erro na reserva! a data de check-out deve ser posterior ao check-in!");
			}
			else {
				reserva.AtualizarData(checkin, checkout);
				System.out.println("Reserva: " + reserva);
			}		
			
		}
		
		sc.close();

	}

}
