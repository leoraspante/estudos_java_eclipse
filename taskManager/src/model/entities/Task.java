package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.enums.Priority;

public class Task {
	
	// Fields.
	private String task;
	private LocalDate startTask;
	private LocalDate finishTask;
	private Priority priority;
	
	// Constructors.
	public Task(String task, LocalDate startTask, LocalDate finishTask, Priority priority) {
		this.task = task;
		this.startTask = startTask;
		this.finishTask = finishTask;
		this.priority = priority;
	}

	// Getters and Setters.
	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public LocalDate getStartTask() {
		return startTask;
	}

	public void setStartTask(LocalDate startTask) {
		this.startTask = startTask;
	}

	public LocalDate getFinishTask() {
		return finishTask;
	}

	public void setFinishTask(LocalDate finishTask) {
		this.finishTask = finishTask;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	
	// Methods.
	@Override
	public String toString() {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		StringBuilder sb = new StringBuilder();
		sb.append("Tarefa: ");sb.append(task);
		sb.append(System.lineSeparator());
		sb.append("Data de início: ");sb.append(startTask.format(fmt)); sb.append(" Data de término: ");sb.append(finishTask.format(fmt));
		sb.append(System.lineSeparator());
		sb.append("Prioridade: ");sb.append(priority);
		sb.append(System.lineSeparator());
		return sb.toString();
	}
}
