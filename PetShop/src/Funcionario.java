
public class Funcionario extends Pessoa {
	private double horasTrab;

	public Funcionario(String nome, int idade, String cpf,double horasTrab) {
		super(nome, idade, cpf);
		this.horasTrab=horasTrab;
	}

	public double getHorasTrab() {
		return horasTrab;
	}

	public void setHorasTrab(double horasTrab) {
		this.horasTrab = horasTrab;
	}

	public double calcSalario() {
		double salario=this.getHorasTrab()*5.5;
		return salario;
		
	}

	
		
	}

