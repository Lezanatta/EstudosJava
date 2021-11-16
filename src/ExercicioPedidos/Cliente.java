package ExercicioPedidos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

	private String nome;
	private String email;
	private Date nascimento;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public Cliente() {
	}
	
	public Cliente(String nome, String email, Date nascimento) {
		this.nome = nome;
		this.email = email;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getAniversario() {
		return nascimento;
	}

	public void setAniversario(Date aniversario) {
		this.nascimento = aniversario;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Cliente: " + nome + " ");
		sb.append("(" + sdf.format(nascimento) +") - ");
		sb.append(email);
		
		return sb.toString();
	}
}
