import java.util.ArrayList;
import java.util.List;

public class Tarefa {
	
	private List<String> tarefas = new ArrayList<>();
	
	void adicionarTarefa(String tarefa) {		
		tarefas.add(tarefa);
		
		System.out.println("Tarefa adicionada.");
	}
	
	void removerTarefa(String tarefa) {		
		tarefas.remove(tarefa);
		
		System.out.println(tarefa + " foi removido.");
	}
	
	void exibirTarefa() {		
		System.out.println(tarefas);
	}
	
	void contarTarefa() {		
		System.out.println("Há " + tarefas.size() + " tarefa.");
	}

	public static void main(String[] args) {
		Tarefa t1 = new Tarefa();
		
		t1.adicionarTarefa("Lavar carro");
		t1.exibirTarefa();
		t1.adicionarTarefa("Fazer compras");
		t1.exibirTarefa();
		t1.removerTarefa("Lavar carro");
		t1.exibirTarefa();
		t1.contarTarefa();
	}

}
