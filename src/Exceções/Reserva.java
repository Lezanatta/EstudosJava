package Exceções;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

	private Integer NumeroQuarto;
	private Date checkIn;
	private Date checkOut;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reserva(Integer numeroQuarto, Date checkIn, Date checkOut) throws DominioException {
		if(!checkOut.after(checkIn)){
			throw new DominioException("Erro na reserva! a data de check-out deve ser posterior ao check-in!");
		}
		NumeroQuarto = numeroQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getNumeroQuarto() {
		return NumeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		NumeroQuarto = numeroQuarto;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	public long Duracao() {
		long diferenca = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diferenca,TimeUnit.MILLISECONDS);		
	}
	
	public void AtualizarData(Date checkIn, Date checkOut) throws DominioException {
		Date agora = new Date();
		if(checkIn.before(agora) || checkOut.before(agora)) {
			throw new DominioException("Erro na reserva! "
					+ "As datas de reserva para atualização devem ser datas futuras!");
		}
		if(!checkOut.after(checkIn)){
			throw new DominioException("Erro na reserva! a data de check-out deve ser posterior ao check-in!");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Quarto " 
				+ NumeroQuarto 
				+", check-in: "
				+sdf.format(checkIn)
				+", check-out: "
				+sdf.format(checkOut)
				+", "
				+Duracao()
				+" noites!";
	}
}
