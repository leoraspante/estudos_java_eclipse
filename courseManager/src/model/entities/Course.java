package model.entities;

import java.util.ArrayList;
import java.util.List;

import model.enums.CourseLevel;

public class Course {
	
	// Fields.
	private String courseName;
	private CourseLevel courseLevel;
	
	private List<Student> students = new ArrayList<>();
	
	// Constructors.
	public Course(String courseName, CourseLevel courseLevel, List<Student> students) {
		this.courseName = courseName;
		this.courseLevel = courseLevel;
		this.students = students;
	}

	public Course(String courseName, CourseLevel courseLevel) {
		this.courseName = courseName;
		this.courseLevel = courseLevel;
	}
	
	// Getters and Setters.
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public CourseLevel getCourseLevel() {
		return courseLevel;
	}

	public void setCourseLevel(CourseLevel courseLevel) {
		this.courseLevel = courseLevel;
	}
	
	public List<Student> getStudents(){
		return students;
	}

	// Methods.
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void removeStudent(int index) {
		students.remove(index);
	}
}
