package Java_OOP_practiceAbstract_quanLyNhanVien;

public abstract class employee {
	private String name;
	protected double salary;
	
	//constructor
	public employee(String name) {
		this.name = name;
	}

	//getter & setter
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public abstract double calculateSalary();
}
