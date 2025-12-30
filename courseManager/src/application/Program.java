// Um sistema de cursos que cadastra alunos e associa cada curso a um nível.

package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Course;
import model.entities.Student;
import model.enums.CourseLevel;
import model.utils.Utils;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Use dot as decimal separator.
		Scanner sc = new Scanner(System.in);
		
		List<Course> courses = new ArrayList<>();
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		// Presentation message.
		System.out.printf("Sistema acadêmico%n");
		String courseQuantityMessage = "Quantos cursos deseja adicionar: ";
		int courseMinQuantity = 1;
		int courseQuantity = Utils.readInt(sc, courseQuantityMessage, courseMinQuantity);

		// Data colletion and registration.
		for (int i=0; i<courseQuantity; i++) {
			System.out.printf("%n%dº Curso:%n", i+1);
			String courseName = Utils.readCourseName(sc, "Nome do curso: ");
			CourseLevel courseLevel = Utils.readCourseLevel(sc, "Informe o nível do curso (Basico, Intermediário, Avancado): ");
			
			Course course = new Course(courseName, courseLevel);
			
			int minOfStudents = 0;
			int numberOfStudents = Utils.readInt(sc, "Quantos alunos deseja matricular neste curso ?: ", minOfStudents);
			for(int j=0; j<numberOfStudents; j++) {
				System.out.printf("%n%dº Aluno:%n", j+1);
				String studentName = Utils.readName(sc, "Nome do aluno: ");
				LocalDate birthDate = Utils.readBirthDate(sc, "Data de nascimento: ", fmt);
				
				Student student = new Student(studentName, birthDate);
				course.addStudent(student);
			}
			courses.add(course);
		}
		
		// Data exibition.
		System.out.printf("%nCursos cadastrados:%n%n");
		for(int i=0; i<courses.size(); i++) {
			Course c = courses.get(i);
			System.out.printf("ID %d - %s, Nível: %s%n", i+1, c.getCourseName(), c.getCourseLevel());
			
			if(c.getStudents().isEmpty()) {
				System.out.println("Nenhum aluno matriculado.");
			}
			else {
				System.out.println("Alunos matriculados:");
				for(Student s : c.getStudents()) {
					
					System.out.printf("- %s. Data de nascimento: %s%n", s.getName(), s.getBirthDate().format(fmt));
				}
			}
			System.out.println();
		}
		
		
		
		sc.close();
	}

}
