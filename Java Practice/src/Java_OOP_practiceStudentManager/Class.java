package Java_OOP_practiceStudentManager;

public class Class {
	private String className, major;

	//Constructor
	public Class(String className, String major) {
		this.className = className;
		this.major = major;
	}

	//Getter & Setter
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
}
