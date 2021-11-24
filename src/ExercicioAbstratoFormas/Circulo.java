package ExercicioAbstratoFormas;

public class Circulo extends Forma{

	private double raio;
	
	public Circulo() {
		super();
	}

	public Circulo(Color color, double raio) {
		super(color);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double Area() {
		return Math.PI * raio * raio;
	}
}
