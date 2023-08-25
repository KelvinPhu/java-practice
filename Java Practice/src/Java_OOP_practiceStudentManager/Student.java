package Java_OOP_practiceStudentManager;

public class Student {
	private int studentID;
	private String studentName;
	private DOB dayOfBirth;
	private double avgScore;
	private Class className;
	
	//Constructor
	public Student(int studentID, String studentName, DOB dayOfBirth, double avgScore, Class className) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.dayOfBirth = dayOfBirth;
		this.avgScore = avgScore;
		this.className = className;
	}

	//Getter & Setter
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public DOB getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(DOB dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public double getAvgScore() {
		return avgScore;
	}

	public void setAvgScore(double avgScore) {
		this.avgScore = avgScore;
	}

	public Class getClassName() {
		return className;
	}

	public void setClassName(Class className) {
		this.className = className;
	}
	
	public String printMajorName() {
		return this.className.getMajor();
	}
	
	public boolean checkPassing() {
		return this.avgScore >= 5.0;
	}
	
	public boolean checkStudentSameDOB(Student anotherStudent) {
		return this.dayOfBirth.equals(anotherStudent.dayOfBirth);
		
	}
}
