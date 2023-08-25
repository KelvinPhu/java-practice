package Java_OOP_practiceStudentManager;

public class test {
	public static void main(String[] args) {
		DOB dob1 = new DOB(12, 02, 1998);
		DOB dob2 = new DOB(12, 02, 1998);
		DOB dob3 = new DOB(12, 03, 2007);
		
		Class class1 = new Class("ICT167", "Computer Science");
		Class class2 = new Class("ICT365", "Software framework");
		Class class3 = new Class("ICT375", "web advance");
		
		Student student1 = new Student(34237012, "Kelvin Huynh", dob1, 4.6, class1);
		Student student2 = new Student(23701293, "JOhnny LE", dob2, 7.8, class2);
		Student student3 = new Student(12803284, "Tammy Dang", dob3, 6.9, class3);
		
		System.out.println("Major Name: " +student1.printMajorName());
		System.out.println("Major Name: " +student2.printMajorName());
		System.out.println("Major Name: " +student3.printMajorName());
		
		System.out.println("check passing: ");
		System.out.println("student 1: " + student1.checkPassing());
		System.out.println("student 2: " + student2.checkPassing());
		System.out.println("student 3: " + student3.checkPassing());
		
		System.out.println("Check same DOB");
		System.out.println("ST1 vs ST2: " + student1.checkStudentSameDOB(student2));
		System.out.println("ST2 vs ST3: " + student2.checkStudentSameDOB(student3));
	}
}
