package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Task;
import model.enums.Options;
import model.enums.Priority;
import model.utils.Utils;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Use a dot as the decimal separator.
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		List<Task> tasks = new ArrayList<>(); // Creation of list.
		
		// Instructions messages.
		System.out.println("Gerenciador de tarefas");
		System.out.println();
		
		// Data capture and registration.
		Integer taskQuantity = Utils.readInt(sc, "Quantas tarefas deseja cadastrar: ");
		for(int i=0; i<taskQuantity; i++) {
			System.out.printf("%nTarefa nº: %d%n", i+1);
			String taskName = Utils.readTaskName(sc, "Nome da tarefa: ");
			LocalDate taskStartDate = Utils.readStartDate(sc, "Informe a data de início da tarefa (dd/MM/yyyy): ", fmt);
			LocalDate taskEndDate = Utils.readEndDate(sc, "Informe a data de término da tarefa (dd/MM/yyyy): ", taskStartDate, fmt);
			Priority priority = Utils.readPriority(sc, "Informe a prioridade da tarefa (Alta,Média,Baixa): ");
			
			tasks.add(new Task(taskName, taskStartDate, taskEndDate, priority));
		}
		
		// First list view.
		System.out.printf("%nTarefas cadastradas:%n%n");
		for(int i=0; i<tasks.size(); i++) {
			System.out.printf("ID %d - Tarefa: %s, Prioridade: %s%n", i+1, tasks.get(i).getTask(), tasks.get(i).getPriority());
		}
		
		// Data modification.
		System.out.printf("%nDeseja realizar alguma alteração (Adicionar, Remover ou Encerrar) ?%n");
		Options modification = Utils.readModification(sc, "Informe a opção desejada: ");
		
		switch(modification) {
		case ADICIONAR:
			taskQuantity = Utils.readInt(sc, "Quantas tarefas deseja adicionar: ");
			for(int i=0; i<taskQuantity; i++) {
				System.out.println();
				String taskName = Utils.readTaskName(sc, "Nome da tarefa: ");
				LocalDate taskStartDate = Utils.readStartDate(sc, "Informe a data de início da tarefa (dd/MM/yyyy): ", fmt);
				LocalDate taskEndDate = Utils.readEndDate(sc, "Informe a data de término da tarefa (dd/MM/yyyy): ", taskStartDate, fmt);
				Priority priority = Utils.readPriority(sc, "Informe a prioridade da tarefa (Alta,Média,Baixa): ");
				
				tasks.add(new Task(taskName, taskStartDate, taskEndDate, priority));
			}
			break;
		case REMOVER:
			Integer listSize = tasks.size();
			Integer removeTask = Utils.removeId(sc, listSize, "Informe a ID da tarefa a ser removida: ");
			tasks.remove(removeTask -1);
			break;
		case ENCERRAR:
			break;
		}
		
		// Second list view.
		System.out.printf("%nTarefas Atualizadas:%n%n");
		for(int i=0; i<tasks.size(); i++) {
			System.out.printf("ID %d - Tarefa: %s, Prioridade: %s%n", i+1, tasks.get(i).getTask(), tasks.get(i).getPriority());
		}
		
		sc.close();
	}

}
