package Lista1;

public class Funcionario {
		
	String nome;
	double salario;
	String cargo;
	
	public Funcionario(String nome, double salario, String cargo) {
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}
	
	public void calcularBonus() {
		
		System.out.println("Funcionario: " + nome);
		System.out.println("Salario: " + salario);
		System.out.println("Cargo: " + cargo);
		
		if (cargo == "Gerente") {
			salario = salario * 0.2;
		} if(cargo == "Analista") {
			salario = salario * 0.1;
		} if(cargo == "Estagiario") {
			salario = salario * 0.05;
		}
	}
		
	public static void main(String[] args) {
		Funcionario Maria = new Funcionario ("Maria", 15000, "Gerente"); // 3000
		Funcionario Jose = new Funcionario ("Jose", 4500, "Analista"); // 450
		Funcionario Clei = new Funcionario ("Clei", 1500, "Estagiario"); // 75
		
		Maria.calcularBonus();
		Jose.calcularBonus();
		Clei.calcularBonus();
	}

}
