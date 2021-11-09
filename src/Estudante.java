
public class Estudante {
	private String name;
	private String email;
	private int quarto;
	
	public Estudante(String name, String email,int quarto) {
		this.name = name;
		this.email = email;
		this.quarto = quarto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		email = email;
	}
	
	public String toString()
	{
		return 
		"Name: " + name
		+ "\nEmail: " + email
		+"\nQuarto: " + quarto;
	}
}
