// Faça um programa que armazene 5 alunos em um array e mostre suas notas.

package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Student;
import model.utils.Utils;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Instructions messages.
		System.out.printf("Cadastro de alunos%nInforme o nome do aluno seguido de sua nota.%n%n");
		
		// Array creation.
		Student[] students = new Student[5];
		
		// Data capture and registration.
		for(int i=0; i<students.length; i++) {
			students[i] = new Student();
			students[i].setName(Utils.readName(sc, "Informe o nome do aluno: "));
			students[i].setGrade(Utils.readDouble(sc, "Informe a nota obtida: "));
			System.out.println();
		}

		// List output.
		System.out.printf("%nAlunos cadastrados:%n");
		for(Student item : students) {
			System.out.println(item);
		}

		
		sc.close();
	}

}
