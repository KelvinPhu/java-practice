package Java_OOP_practiceAbstract_quanLyNhanVien;

public class manager extends employee {

	public manager(String name) {
		super(name);
	}

	@Override
	public double calculateSalary() {
		double baseSalary = 5000;
		double bonus = 1500;
		return salary = baseSalary + bonus;
	}	
}