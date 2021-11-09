package ExercicioList;

public class Funcionario {
	private Integer id;
	private String name;
	private Double salary;
	
	public Funcionario(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void AumentarSalary(double porcentagem) {
		
		salary += salary * porcentagem /100;
	}
	
	public String toString()
	{
		return 
		"Id: " + id
		+ "\nName: " + name
		+"\nSalary: " + salary;
	}

	public int getId() {
		return id;
	}
	

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
