package entiti;

public class Funcionario {
	private String nome;
	private int id;
	private double salario;

	public Funcionario(String nome, int id, double salario) {
		this.nome = nome;
		this.id = id;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "Funcionario: "+ nome+ "/ ID: "+ id+ "/ Salario "+salario;
	}
	
	public void aumento(double porcento) {
		porcento = porcento/100;
		salario = salario*porcento;
	}
}
