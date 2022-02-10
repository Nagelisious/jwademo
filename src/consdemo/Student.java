package consdemo;

public class Student {
	int studentId;
	String studentName;
	int marks;
	int grade;
	
	public Student() {
		studentId = -1;
		studentName = "...";
		marks = -1;
		grade = -1;
	}
	
	public Student(int studentId, String studentName) {
		this();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public Student(int studentId, String studentName, int marks, int grade) {
		this();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		this.grade = grade;
	}

	public void printStudentDetails() {
		System.out.println("--- Details about student");
		System.out.println("Student Id: " + studentId);
		System.out.println("Student Name: " + studentName);
		System.out.println("Marks: " + marks);
		System.out.println("Grade: " + grade);
	}

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student(420, "Dracula");
		Student student3 = new Student(69, "Nagatoro", 0, 100);
		
		student1.printStudentDetails();
		student2.printStudentDetails();
		student3.printStudentDetails();
	}

}
