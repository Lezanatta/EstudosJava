package ExercicioFuncionario;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Funcionario {
	
	private String nome;
	private LevelTrabalhador level;
	private double baseSalarial;
	private Departamento departamento;
	private List<HorasContrato> horasDeContrato = new ArrayList<HorasContrato>();
	
	public Funcionario() {
		
	}
	public Funcionario(String nome, LevelTrabalhador level, double baseSalarial,Departamento departamento) {
		this.nome = nome;
		this.level = level;
		this.baseSalarial = baseSalarial;
		this.departamento = departamento;
	}
	
	public void AdicionarContrato(HorasContrato contrato) {
		horasDeContrato.add(contrato);
	}
	
	public void RemoverContrato(HorasContrato contrato) {
		horasDeContrato.remove(contrato);
	}
	
	public double Renda(int ano, int mes) {
		double soma = baseSalarial;
		Calendar cal = Calendar.getInstance();
		for(HorasContrato c : horasDeContrato) {
			cal.setTime(c.getData());	
			if(cal.get(Calendar.YEAR) == ano && mes == cal.get(Calendar.MONTH) + 1)
				soma+= c.totalValor();
		}
		return soma;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LevelTrabalhador getLevel() {
		return level;
	}
	public void setLevel(LevelTrabalhador level) {
		this.level = level;
	}
	public double getBaseSalarial() {
		return baseSalarial;
	}
	public void setBaseSalarial(double baseSalarial) {
		this.baseSalarial = baseSalarial;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public List<HorasContrato> getHorasDeContrato() {
		return horasDeContrato;
	}
	public void setHorasDeContrato(List<HorasContrato> horasDeContrato) {
		this.horasDeContrato = horasDeContrato;
	}
}
