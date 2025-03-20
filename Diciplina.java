package Lista1;

class Aluno{
	private String nome;
	private String matricula;
	
	public Aluno (String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	//Colocar os metodos Setter e Getter para acessar indiretamente os astributos privados

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	

}

public class Diciplina {
	String nome;
	public Aluno[] alunos = new Aluno[2];
	
	public Diciplina (String nome) {
		this.nome = nome;
	}
	
	public void ExibirAlunos() {
		
		System.out.println("Diciplina: " + nome);
		for(Aluno a: alunos) {
			System.out.println("Aluno: " + a.getNome() + "    " + "Matricula: " + a.getMatricula());
		}
	}
	
	public void AdicionarAluno() {
		
	}
	
	public static void main(String[] args) {
		Diciplina diciplina = new Diciplina("LTP II");
		Aluno a1 = new Aluno ("Joao", "123");
		Aluno a2 = new Aluno ("Maria", "345");
		
		diciplina.alunos[0] = a1;
		diciplina.alunos[1] = a2;
		
		diciplina.ExibirAlunos();
	}
}
